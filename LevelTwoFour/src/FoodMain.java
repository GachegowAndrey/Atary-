public class FoodMain
{
    /*Программа которая поможет выбрать, что съесть на обед.
     */

    public static void main(String[] args)
    {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food)selectable;

        foodMethods(food);
        selectableMethods(selectable);

    }

    public static void foodMethods(Food food)
    {
        food.onEat();
        food.onSelect();
    }

    public static void selectableMethods(Selectable selectable)
    {
        selectable.onSelect();
    }

    interface Selectable
    {
        void onSelect();
    }

    static class Food implements Selectable
    {
        public void onSelect()
        {
            System.out.println("the food was select");
        }

        public void onEat()
        {
            System.out.println("The food was eaten");
        }


    }

}
