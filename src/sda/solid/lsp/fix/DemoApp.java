package sda.solid.lsp.fix;

public class DemoApp {
    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("========= Odczyt z pliku =========");
        System.out.println("==================================");

        /**
         * Dla Readable mamy 2 klasy pochodne i można je wymiennie stosować
         * i za każdym razem wywołanie metody read() zadziała w oczekiwany,
         * zgodny z nazwą metody :) sposób
         */

        Readable readable = new ReadableFile();
        readable.read("Jakiś plik");
        System.out.println("------------");
        readable = new File();
        readable.read("Inny plik");


        System.out.println("==================================");
        System.out.println("========= Zapis do pliku =========");
        System.out.println("==================================");

        Writable writable = new File();
        writable.write("Plik do zapisu", new byte[10]);
    }
}
