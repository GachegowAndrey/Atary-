package FactoruHen;

public class BelarusianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 11;
    }

    @Override
    String getDescription()
    {
        return super.getDescription()+String.format
                ("My country is %s. I give you  %d eggs in a month. ",Country.BELARUS,getCountOfEggsPerMonth());
    }
}
