package practicalTasks.second;

public class Salmon extends Fish{
    private String name;

    public Salmon(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
