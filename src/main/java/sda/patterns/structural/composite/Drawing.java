package sda.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private String title;
    private List<Shape> shapes;

    public Drawing(String title) {
        this.title = title;
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public void removeShape(Shape s) {
        shapes.remove(s);
    }

    @Override
    public void draw() {
        System.out.println("Rysujemy: " + title);
        shapes.forEach(Shape::draw);

    }
}
