package sda.patterns.behavioral.visitor;

public class VisitorDemoApp {

    public static void main(String[] args) {

        int shoppings = 0;
        Calculator calculator = new PriceCalculator();
        Merchandise butter = new Butter(40, 8, "Łowickie");
        Merchandise fridge1 = new Fridge("Bosh", "123ABC", 3000);
        Merchandise fridge2 = new Fridge("Lidl", "321xyz", 200);
        Cereal cereal = new Cereal("Górskie", 2.3f, 6);

        shoppings += butter.accept(calculator);
        shoppings += fridge1.accept(calculator);
        shoppings += fridge2.accept(calculator);
        shoppings += cereal.accept(calculator);

        System.out.println("Shopping total: " + shoppings);


    }
}
