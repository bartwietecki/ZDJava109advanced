package sda.patterns.creational.singleton;

public class LazySingletonDemo {
    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
    }
}
