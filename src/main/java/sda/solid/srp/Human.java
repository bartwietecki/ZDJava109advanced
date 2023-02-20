package sda.solid.srp;

public class Human {

    private String name;
    private String surname;
    private int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    /**
     * Klasa Human łamie zasadę SRP bo zawiera dane ale też reguły biznesowe i:
     *  - może być potrzeba dołożenia kolejnych danych, np. płeć, liczba dzieci, ...
     *  - może nastąpić zmiana w regule sprawdzania prawa jazdy bo np. w innym kraju to będzie od 16 lat
     */
    public boolean canHaveDrivingLicense() {
        return age >= 18;
    }


}
