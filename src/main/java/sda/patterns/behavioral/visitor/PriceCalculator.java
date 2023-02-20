package sda.patterns.behavioral.visitor;

public class PriceCalculator implements Calculator {
    @Override
    public int calculate(Butter butter) {
        System.out.println(butter.getName() + " price: " + butter.getCommonValue());
        return butter.getCommonValue();
    }

    @Override
    public int calculate(Cereal cereal) {
        float cerealPrice = cereal.getPricePerKilo() * cereal.getWeight();
        System.out.println(cereal.getName() + " price: " + cerealPrice);
        return Math.round(cerealPrice);
    }

    @Override
    public int calculate(Fridge fridge) {
        System.out.println("Fridge " + fridge.getName() + " S/N: " + fridge.getSerialNumber() + " price: " + fridge.getValue());
        if(fridge.getValue() > 600) {
            System.out.println("Discount available!");
            System.out.println("Price after discount: " + (fridge.getValue() - 50));
            return fridge.getValue() - 50;
        }
        return fridge.getValue();
    }
}
