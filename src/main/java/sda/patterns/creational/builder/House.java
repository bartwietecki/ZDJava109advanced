package sda.patterns.creational.builder;

public class House {

    private String basement;
    private String walls;
    private String roof;
    private String garage;
    private String garden;

    public House(HouseBuilder builder) {
        basement = builder.basement;
        walls = builder.walls;
        roof = builder.roof;

        garage = builder.garage;
        garden = builder.garden;
    }

    public String getInfo() {
        return "Dom: fundamenty - " + basement +
                ", ściany - " + walls +
                ", dach - " + roof +
                (garage != null ? ", garaż - " + garage : "") +
                (garden != null ? ", ogród - " + garden : "") +
                ".";
    }

    public static class HouseBuilder {

        private String basement;
        private String walls;
        private String roof;

        private String garage;
        private String garden;

        public HouseBuilder(String basement, String walls, String roof) {
            this.basement = basement;
            this.walls = walls;
            this.roof = roof;
        }

        public HouseBuilder withGarden(String garden) {
            this.garden = garden;
            return this;
        }

        public HouseBuilder withGarage(String garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

}
