package Repka;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) {
        List<Person> plot= new ArrayList<>();
        plot.add(new Person("Репка","Репку"));
        plot.add(new Person("Дедка","Дедку"));
        plot.add(new Person("Бабка","Бабку"));
        plot.add(new Person("Внучка","Внучку"));
        RepkaStory.tell(plot);
    }
}