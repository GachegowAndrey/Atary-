import java.util.*;
public class BowlingGame {
    /**Необходимо добавить метод getWinner(),
     * который рассчиает и выведет в результат
     * имя игрока с максимальным количеством баллов
     * ВВод Any 42
     * Dave 64
     * Rob 103
     * Вывод Rob*/
   static ArrayList<Integer> all = new ArrayList<Integer>();
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner scanner=new Scanner(System.in);
        int countPlayers=3;
        for (int i = 0; i <countPlayers ; i++) {
            String input =scanner.nextLine();
            String [] values=input.split(" ");
            String name=values[0];
        int points = Integer.parseInt(values[1]);
        all.add(Integer.parseInt(values[1]));
            Collections.sort(all);
        game.addPlayer(name,points);
        }
        game.getWinner();
    }
}
class Bowling{
    HashMap<String,Integer> players=new HashMap<>();
    Bowling(){
    }
    public void addPlayer(String name,int score){
        players.put(name,score);
    }
    public void getWinner(){
        Collections.sort(BowlingGame.all);
        for(Map.Entry<String, Integer> entry: players.entrySet()) {
            if (entry.getValue().equals( BowlingGame.all.get(BowlingGame.all.size() -1)) ) {
                System.out.println(entry.getKey());
            }
        }
    }
}
/*
import java.util.*;
with input "AAA 100\nBBB 200\nCCC 300\n"
after Bowling() you get:
  al: [100, 200, 300]
  players: {AAA=100, CCC=300, BBB=200}
ok
but after for() in main() you get:
  al:[100, 200, 300, 300, 300, 300]
al is longer, because the input is "CCC 300" 
and you add 300 at end of existed al 3x (!)
then in getWinner():
  if (entry.getValue() == al.get(al.size() -1))
you compare every players.value with 300,
all tests are false because you compare Objects and not their values (!)
use this instead
  if (entry.getValue()  .equals  ( al.get(al.size() -1)) ) {
is this answer to your question?
*/