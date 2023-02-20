package sda.patterns.behavioral.visitor;

public interface Calculator {
    int calculate(Butter butter);
    int calculate(Cereal cereal);

    int calculate(Fridge fridge);
}
