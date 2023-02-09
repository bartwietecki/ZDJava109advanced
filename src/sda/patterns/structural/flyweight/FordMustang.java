package sda.patterns.structural.flyweight;

public class FordMustang {
    private FordMustangBase fordMustangBase;
    private String radio;

    // mamy konfigurator Forda mustanga, gdzie możemy składać zamówienie na samochód
    // on ma jakąś skończoną ilość silników i kolorów ... ma on dużo innych elementów, które samochód do samochodu może
    // się różnić. Ktoś chce takie fotele, ktoś inne; ktoś chce podgrzewaną kierownicę, ktoś inną, itd..

    // I możemy zawartość obiektu FordMustang możemy zmienić na część wolnozmienną lub często powtarzającą się

    public FordMustang(String color, String engine, String radio) {
        System.out.println(this.getClass() + " - konstruktor");
        fordMustangBase = MustangBaseFactory.getMustangBase(color, engine);
        this.radio = radio;
    }

    public String getCarInfo() {
        return new StringBuilder("ForMustang: ")
                .append("\n\t kolor : ").append(fordMustangBase.getColor())
                .append("\n\t silnik : ").append(fordMustangBase.getEngine())
                .append("\n\t radio : ").append(radio)
                .toString();
    }
}
