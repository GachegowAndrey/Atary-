package Currency;

public class Euro extends Money {
    Euro (double amount){
        super(amount);
    }
    @Override
    public String getCurrencyName(){
        return "EURO";
    }
}
