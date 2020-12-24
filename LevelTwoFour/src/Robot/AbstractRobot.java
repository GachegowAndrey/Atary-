package Robot;

public class AbstractRobot implements Attackable,Defensable
{
    //public int hitCount= (int) (Math.random()*4);
    //public int hitMinus=0;
    @Override
    public BodyPart attack() {
        BodyPart attackedBodyPart=null;
        int hitCount= (int) (Math.random()*4);

        if (hitCount==1)
        {
            attackedBodyPart=BodyPart.ARM;
            BodyPart.ARM.damage=hitCount;
            hitCount=0;
        }
        else if (hitCount==2)
        {
            attackedBodyPart=BodyPart.HEAD;
            BodyPart.HEAD.damage=hitCount;
            hitCount=0;


        }
        else if (hitCount==3)
        {
            attackedBodyPart=BodyPart.LEG;
            BodyPart.LEG.damage=hitCount;
            hitCount=0;
        }
        else {
            hitCount=4;
            attackedBodyPart=BodyPart.CHEST;
            BodyPart.CHEST.damage=hitCount;
            hitCount=0;
        }

        return attackedBodyPart;
    }

    @Override
    public BodyPart defence()
    {
        int hitCount= (int) (Math.random()*4);
        BodyPart defenceBodyPart=null;
        hitCount=hitCount;

        if (hitCount==1)
        {
            defenceBodyPart=BodyPart.HEAD;
        }
        else if (hitCount==2)
        {
            defenceBodyPart=BodyPart.LEG;
        }
        else if (hitCount==3)
        {
            defenceBodyPart=BodyPart.CHEST;
        }
        else {
            hitCount=0;
            defenceBodyPart=BodyPart.ARM;
        }

        return defenceBodyPart;
    }

}
