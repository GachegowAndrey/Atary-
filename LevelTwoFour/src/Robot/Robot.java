package Robot;

public class Robot extends AbstractRobot
{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    private String name;
    private int health;
    private int damage;

    public Robot (String name,int health,int damage)
    {
        this.name=name;
        this.health=health;
        this.damage=damage;
    }

    public int getDamage() {
        return damage;
    }
}
