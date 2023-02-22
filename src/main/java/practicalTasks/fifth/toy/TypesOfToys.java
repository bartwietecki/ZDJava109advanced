package practicalTasks.fifth.toy;

public enum TypesOfToys {
    DOLLS(01, "Do", "Lalki"),
    BLOCKS(02, "Bl", "Klocki"),
    VEHICLES(03, "Ve", "Pojazdy"),
    STUFFED_TOYS(04, "St", "Pluszaki"),
    FIGURINES(05, "Fi", "Figurki"),
    PUZZLES(06, "Pu", "Puzzle");

    private final int number;
    private final String shortcut;
    private final String polishName;

    TypesOfToys(int number, String shortcut, String polishName) {
        this.number = number;
        this.shortcut = shortcut;
        this.polishName = polishName;
    }

    public int getNumber() {
        return number;
    }

    public String getShortcut() {
        return shortcut;
    }

    public String getPolishName() {
        return polishName;
    }

    //TODO Grzegorz musi zobaczyć jak to sensownie zrobić - na razie mam to zostawić (zrobienie Fabryki)

    // metoda
    public static TypesOfToys findByNumber(int number) {
        for (TypesOfToys n : TypesOfToys.values()) {
            if(n.number == number) {
                return n;
            }
        }
        return null;
    }
}