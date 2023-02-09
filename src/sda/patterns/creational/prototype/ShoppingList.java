package sda.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList implements Cloneable {

    private List<String> shoppings;

    public ShoppingList(List<String> shoppings) {
        this.shoppings = shoppings;
    }

    public ShoppingList() {
        this.shoppings = new ArrayList<>();
        shoppings.add("ser");
        shoppings.add("chleb");
        shoppings.add("pomidory");
    }

    public List<String> getShoppings() {
        return shoppings;
    }

    public void setShoppings(List<String> shoppings) {
        this.shoppings = shoppings;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> localList = new ArrayList<>();
        localList.addAll(shoppings);
        return new ShoppingList(localList);
    }
}
