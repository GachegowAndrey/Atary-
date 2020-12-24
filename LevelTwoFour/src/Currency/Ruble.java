package Currency;

public class Ruble extends Money {
    Ruble (double amount){
        super(amount);
    }

    @Override
    public String getCurrencyName(){
        return "RUB";
    }
}
