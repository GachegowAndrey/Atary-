package Currency;

public class USD extends Money {
    USD(double amount){
        super(amount);
    }
    public String getCurrencyName(){
        return "USD";
    }
}
