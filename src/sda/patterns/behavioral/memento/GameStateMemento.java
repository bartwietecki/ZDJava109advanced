package sda.patterns.behavioral.memento;

public class GameStateMemento {

    private int id;

    private String details;

    public GameStateMemento(int id, String details) {
        this.id = id;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public String getDetails() {
        return details;
    }
}
