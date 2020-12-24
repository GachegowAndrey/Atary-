package Robot;

public class Solution
{
    public static void main(String[] args) {
        Robot amigo= new Robot("Amigo",20,2);
        Robot enemy = new Robot("Hunter",50,3);//add atack health expirienc defence stats skills (magic fatigue)

        Fight(amigo,enemy);

    }

    public static void Fight(Robot robotFirst,Robot robotSecond)

    {
        while (robotSecond.getHealth()>=0)
        {
            BodyPart attacked= robotFirst.attack();
            BodyPart defensed= robotFirst.defence();
            robotSecond.setHealth(robotSecond.getHealth()-attacked.damage*robotFirst.getDamage());
            int health=robotSecond.getHealth();
            System.out.printf("%s атаковал робота %s , атакована %s , осталось здоровья %s  ",robotFirst.getName(),robotSecond.getName(),attacked,health);

            System.out.println();
        }
        System.out.println(robotSecond.getName()+" Died");

    }

    public static void doMove(Robot robotFirst, Robot robotSecond)
    {
        BodyPart attacked= robotFirst.attack();
        BodyPart defensed= robotFirst.defence();
        //System.out.println(String.format("%s attacked robot %s, was attacking %s, defenced %s, "+robotFirst.getName(),robotSecond.getName(),attacked,defensed));

        //System.out.printf("%s атаковал робота %s , атакована %s , защищена %s  ",robotFirst.getName(),robotSecond.getName(),attacked,defensed);

    // robotSecond.setHealth(robotSecond.getHealth());
      robotSecond.setHealth(robotSecond.getHealth()-attacked.damage);
        int health=robotSecond.getHealth();

        System.out.printf("%s атаковал робота %s , атакована %s , осталось здоровья %s  ",robotFirst.getName(),robotSecond.getName(),attacked,health);

        System.out.println();
    }

}
