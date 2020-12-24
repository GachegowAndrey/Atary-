package Currency;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Person ivan = new Person("Иван");
       for (Money money:ivan.getAllMoney()){
           System.out.println(ivan.name+" имеет "+
                   money.getAmount()+" "+money.getCurrencyName());
       }
    }

    public static class Person{
        public String name;

        public Person(String name){
            this.name=name;
            this.allMoney=new ArrayList<Money>();
            allMoney.add(new Euro(200));
            allMoney.add(new USD(900));
            allMoney.add(new Ruble(5000));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney(){
            return  allMoney;
        }
    }
}
