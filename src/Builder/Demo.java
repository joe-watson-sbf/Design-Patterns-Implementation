package Builder;

public class Demo {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost : " + vegMeal.getCost());


        Meal nonVegMeal = builder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost : " + nonVegMeal.getCost());
    }
    
}
