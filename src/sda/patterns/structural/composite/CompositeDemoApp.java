package sda.patterns.structural.composite;

public class CompositeDemoApp {

    public static void main(String[] args) {

        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape triangle3 = new Triangle();

        Shape circle1 = new Circle();
        Shape circle2 = new Circle();

        Shape drawing1 = new Drawing("Akwarelka");
        Shape drawing2 = new Drawing("Duża praca");

        ((Drawing) drawing1).addShape(triangle1);
        ((Drawing) drawing1).addShape(triangle2);
        ((Drawing) drawing1).addShape(circle1);
        ((Drawing) drawing2).addShape(circle2);
        ((Drawing) drawing2).addShape(triangle3);
        ((Drawing) drawing2).addShape(drawing1);
        System.out.println("=============================");
        drawing2.draw();
    }
}
