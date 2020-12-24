import com.sun.jdi.ThreadGroupReference;

import java.util.ArrayList;
import java.util.List;

public class CleaningCenter {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TWoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanApartments(apartments);
    }

    interface Apartment{

    }

    public static void cleanApartments(List<Apartment> apartments)
    {
        for (Apartment apartment:apartments) {
            if (apartment instanceof OneRoomApt) ((OneRoomApt) apartment).clean1Rooms();
            else if (apartment instanceof TWoRoomApt) ((TWoRoomApt) apartment).clean2Rooms();
            else if (apartment instanceof ThreeRoomApt) ((ThreeRoomApt) apartment).clean3Rooms();
        }
    }


    static class OneRoomApt implements Apartment{
        void clean1Rooms(){
            System.out.println("1 Room are cleaned");
        }
    }

    static class TWoRoomApt implements Apartment{
        void clean2Rooms(){
            System.out.println("2 Rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment{
        void clean3Rooms(){
            System.out.println("3 Rooms are cleaned");
        }
    }
}
