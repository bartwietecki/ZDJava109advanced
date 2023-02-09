package sda.patterns.behavioral.templateMethod;

public abstract class NewsProvider {
    private String message;

    // metoda do implementacji
    public abstract boolean autohize();

    //metoda - część algorytmu, już zaimplementowana, niezmienna
    private final boolean sendMessage() {
        System.out.println("Wysyłanie wiadomości: " + message);
        return true;
    }

    // metoda do implementacji
    public abstract boolean endConnection();

    // metoda z algorytmem - niezmienna
    public final void provideNews() {
        if (autohize()) {
            sendMessage();
            endConnection();
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
