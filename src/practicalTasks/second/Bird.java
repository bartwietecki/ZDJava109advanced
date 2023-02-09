package practicalTasks.second;

public abstract class Bird extends Animal {
    @Override
    public String move() {
        return "Bird " + getName() + " is flying";
    }
}
