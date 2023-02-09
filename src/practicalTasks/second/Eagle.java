package practicalTasks.second;

public class Eagle extends Bird{
    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
