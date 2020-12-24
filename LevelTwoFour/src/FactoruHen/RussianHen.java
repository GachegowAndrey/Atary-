package FactoruHen;

public class RussianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 5;
    }

    @Override
    String getDescription()
    {
        return super.getDescription()+String.format
                ("My country is %s. I give you  %d eggs in a month. ",Country.RUSSIA,getCountOfEggsPerMonth());
    }
}
