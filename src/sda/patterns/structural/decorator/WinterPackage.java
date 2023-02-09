package sda.patterns.structural.decorator;

public class WinterPackage extends CarDecorator {

    private boolean heatedMirrors;
    private boolean heatedSeats;

    public WinterPackage(Car car, boolean electricMirrors, boolean heatedSeats) {
        super(car);
        this.heatedMirrors = electricMirrors;
        this.heatedSeats = heatedSeats;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding winter features " + (heatedMirrors ? "with heated mirrors" : "") +
                (heatedSeats ? " with heated seats" : ""));
    }
}
