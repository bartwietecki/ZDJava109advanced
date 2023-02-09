package practicalTasks.second;

public class PussyCat extends Cat{
    private String name;

    public PussyCat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
