package Robot;

public class BodyPart
{
    final static BodyPart LEG= new BodyPart("нога",0);
    final static BodyPart HEAD= new BodyPart("голова",0);
    final static BodyPart ARM= new BodyPart("рука",0);
    final static BodyPart CHEST= new BodyPart("грудь",0);

    private String bodyPart;
    int damage;
    private BodyPart(String bodyPart,int damage)
    {
        this.bodyPart=bodyPart;
        this.damage=damage;

    }
    public String toString()
    {
        return this.bodyPart;
    }

}
