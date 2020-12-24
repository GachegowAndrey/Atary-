package FactoruHen;

public class MoldovanHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 9;
    }

    @Override
    String getDescription()
    {
        return super.getDescription()+String.format
                ("My country is %s. I give you  %d eggs in a month. ",Country.MOLDOVA,getCountOfEggsPerMonth());
    }
}
