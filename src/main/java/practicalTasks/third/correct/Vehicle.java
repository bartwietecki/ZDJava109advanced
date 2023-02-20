package practicalTasks.third.correct;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private String transmissionType;
    private String fuelType;
    private double engineCapacity;

    public Vehicle(String brand, String model, int year, String transmissionType,
                   String fuelType, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.transmissionType = transmissionType;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }

    public String getMake() {
        return brand;
    }

    public void setMake(String make) {
        this.brand = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", transmissionType='" + transmissionType + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
