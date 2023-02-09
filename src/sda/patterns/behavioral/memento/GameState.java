package sda.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class GameState {

    private int id;
    private String gameStateSummary;

    private List<GameStateMemento> saves;

    public GameState(int id, String gameStateSummary) {
        this.id = id;
        this.gameStateSummary = gameStateSummary;
        saves = new ArrayList<>();
    }

    public void changeGameState(int id, String gameStateSummary) {
        this.id = id;
        this.gameStateSummary = gameStateSummary;
    }

    public boolean saveGame(){
        return saves.add(new GameStateMemento(id, gameStateSummary));
    }

    public boolean restoreGame(int id) {
        GameStateMemento restored = saves.stream()
                .filter(save -> save.getId() == id)
                .findFirst()
                .orElseThrow();
        this.id = restored.getId();
        this.gameStateSummary = restored.getDetails();
        return true;
    }

    public String gameInfo() {
        return new StringBuilder("GameState: ")
                .append(" id = ")
                .append(id)
                .append(", details = ")
                .append(gameStateSummary)
                .append(".")
                .toString();
    }
}
