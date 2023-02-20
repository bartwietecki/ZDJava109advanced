package sda.solid.lsp.fix;

@FunctionalInterface
public interface Readable {

    byte[]read (String filename);

    /**
     * Poniższe meotdy to prezentacja możliwości interfejsu a nie zasady Liskov !
     */
    default void someNonAbstractMethod() {
        System.out.println("Non abstract method called from interface");
        somePrivateMethod();
    }

    static void someStaticMethod() {
        System.out.println("Call static");
    }

    private void somePrivateMethod() {
        System.out.println("Private call");
    }
}
