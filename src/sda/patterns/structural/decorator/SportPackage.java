package sda.patterns.structural.decorator;

public class SportPackage extends CarDecorator {

    private boolean sportWheel;
    private boolean sportSeats;

    public SportPackage(Car car,boolean sportWheel,boolean sportSeats  ) {
        super(car);
        this.sportWheel = sportWheel;
        this.sportSeats = sportSeats;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sport package " + (sportSeats ? "with sport seats" : "") + (sportWheel ?
                " with sport wheel" : ""));
    }

}
