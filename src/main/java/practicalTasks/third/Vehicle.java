package practicalTasks.third;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int yearOfProduction;
    private String gearBox;
    private String fuel;
    private double engine;

    public Vehicle(String brand, String model, int yearOfProduction, String gearBox, String fuel, double engine) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.gearBox = gearBox;
        this.fuel = fuel;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", gearBox='" + gearBox + '\'' +
                ", fuel='" + fuel + '\'' +
                ", engine=" + engine +
                '}';
    }
}
