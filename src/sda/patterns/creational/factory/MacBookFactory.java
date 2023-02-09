package sda.patterns.creational.factory;

public class MacBookFactory {
    public static MacBook getMac(String type, int memory, int disc, int screenSize) {
        MacBook mac;
        if ("Air".equalsIgnoreCase(type)) {
            System.out.println("Zlecenie na Maca Air");
            return new MacBookAir(memory, disc, screenSize);
        } else if ("Pro".equalsIgnoreCase(type)) {
            System.out.println("Zlecenie na Maca Pro");
            return new MacBookPro(memory, disc);
        } else {
            System.out.println("Nierozpoznany typ Maca");
            throw new IllegalArgumentException("Mac type not recognized");
        }
    }

}
