package FactoruHen;

public class Main
{
    public static void main(String[] args)
    {
        Hen hen =HenFactory.getHen(Country.BELARUS);
        Hen hen1 =HenFactory.getHen(Country.RUSSIA);
        Hen hen2 =HenFactory.getHen(Country.UKRAINE);
        Hen hen3 =HenFactory.getHen(Country.MOLDOVA);
        //hen.getCountOfEggsPerMonth();
       //hen.getDescription();
        System.out.println(hen.getDescription());
        System.out.println(hen1.getDescription());
        System.out.println(hen2.getDescription());
        System.out.println(hen3.getDescription());

    }

    static class HenFactory
    {
        static Hen getHen(String country)
        {
            Hen hen=null;
            switch (country)
            {
                case Country.BELARUS:
                {
                    hen=new BelarusianHen();
                    break;
                }
                case Country.RUSSIA:
                {
                    hen=new RussianHen();
                    break;
                }
                case Country.UKRAINE:
                {
                    hen=new UkrainianHen();
                    break;
                }
                case Country.MOLDOVA:
                {
                    hen=new MoldovanHen();
                    break;
                }

            }
            //your code
            return hen;
        }
    }

}
