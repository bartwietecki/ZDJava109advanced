package sda.patterns.creational.prototype;

import java.util.List;

public class PrototypeDemoApp {

    public static void main(String[] args) {

        ShoppingList original = new ShoppingList();

        try {
            ShoppingList shoppingListForMonday = (ShoppingList) original.clone();
            List<String> mondayList = shoppingListForMonday.getShoppings();
            mondayList.remove("pomidory");
            mondayList.remove("mleko");
            shoppingListForMonday.setShoppings(mondayList);
            System.out.println("Monday shoppings:");
            shoppingListForMonday.getShoppings().forEach(System.out::println);

            System.out.println("================");

            ShoppingList shoppingListForFriday = (ShoppingList) original.clone();
            List<String> fridayList = shoppingListForFriday.getShoppings();
            fridayList.remove("chleb");
            fridayList.add("maritini");
            fridayList.add("gin");
            fridayList.add("sok pomidorowy");
            shoppingListForFriday.setShoppings(fridayList);
            System.out.println("Friday shoppings:");
            shoppingListForFriday.getShoppings().forEach(System.out::println);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
