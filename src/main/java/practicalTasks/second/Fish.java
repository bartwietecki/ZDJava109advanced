package practicalTasks.second;

public abstract class Fish extends Animal {
    @Override
    public String sound() {
        return "Fish " + getName() + " doesn't make a sound";
    }

    @Override
    public String move() {
        return "Fish " + getName() + " is swimming";
    }
}