import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Snake extends JPanel implements ActionListener {

    private final int size =600;
    private final int dotSize=16;
    private final int allDots=400;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;

    private int []x=new int[allDots];
    private int[]y=new int [allDots];

    private int dots;
    private Timer timer;

    private boolean left=false;
    private boolean right=false;
    private boolean up =false;
    private boolean down=true;
    private boolean inGame=true;

    public Snake(){
        setBackground(Color.white);
        loadImage();
        intGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
    }


    public void intGame(){
        dots=3;
        for (int i = 0; i <dots ; i++) {
            x[i]=48-i*dotSize;
            y[i]=48;
        }
        timer=new Timer(250,this);
        timer.start();
        createApple();
    }

    public void createApple(){
        appleX=new Random().nextInt(20)*dotSize;
        appleY=new Random().nextInt(20)*dotSize;
    }

    public void loadImage(){
         final String APPLE_SIGN="\uD83C\uDF4E";
         final String BODY_SIGN = "\u26AB";
        ImageIcon appleImage = new ImageIcon(APPLE_SIGN);
        apple=appleImage.getImage();
        ImageIcon snakeImage = new ImageIcon(BODY_SIGN);
        dot=snakeImage.getImage();
    }


    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        if (inGame){
            graphics.drawImage(apple,appleX,appleY,this);
            for (int i=0;i<dots;i++){
                graphics.drawImage(dot,x[i],y[i],this);
            }
        }
        else {
            String string ="GameOver";
            graphics.setColor(Color.black);
            //Font f = new Font("Arial",14,Font.BOLD);
            graphics.drawString(string,125,size/2);
            // g.setFont(f);
        }
    }


    public void move(){
        for (int i =dots;i>0;i--){
            x[i]=x[i-1];
            y[i]=y[i-1];
        }
        if (left){
            x[0]-=dotSize;
        } if (right){
            x[0]+=dotSize;
        } if (up){
            y[0]-=dotSize;
        } if(down){
            y[0]+=dotSize;
        }
    }


    public void checkApple(){
        if(x[0] == appleX && y[0] == appleY){
            dots++;
            createApple();

        }
    }


    // не столкнулся ли я сам с собой или с бордюрами
    public void checkCollisions(){
        for(int i = dots; i >0; i--) {
            if (i > 4 && x[0] == x[i] && y[0] == y[i]){
                inGame = false;
            }
        }
        if(x[0]>size){
            inGame = false;
        }
        if(x[0]<0){
            inGame = false;
        }
        if(y[0]>size){
            inGame = false;
        }
        if(y[0]<0){
            inGame = false;
        }
    }


    public void actionPerformed(ActionEvent event) {
        if(inGame){
            checkApple();
            checkCollisions();
            move();
        }
        repaint();
    }

    class FieldKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_LEFT && !right){
                left = true;
                up = false;
                down = false;
            }
            if(key == KeyEvent.VK_RIGHT && !left){
                right = true;
                up = false;
                down = false;
            }

            if(key == KeyEvent.VK_UP && !down){
                right = false;
                up = true;
                left = false;
            }
            if(key == KeyEvent.VK_DOWN && !up){
                right = false;
                down = true;
                left = false;
            }
        }
    }
}
