import javax.swing.*;

public class Main extends JFrame {

    public Main(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(670,690);
        add(new Snake());
        setLocation(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {

        Main sg= new Main();
    }
}
