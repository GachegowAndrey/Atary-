package FactoruHen;

public class UkrainianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 10;
    }

    @Override
    String getDescription()
    {
        return super.getDescription()+String.format
                ("My country is %s. I give you  %d eggs in a month. ",Country.UKRAINE,getCountOfEggsPerMonth());
    }
}
