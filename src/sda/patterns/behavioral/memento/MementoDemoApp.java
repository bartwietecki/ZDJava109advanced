package sda.patterns.behavioral.memento;

public class MementoDemoApp {
    public static void main(String[] args) {
        GameState gameState = new GameState(1, "Biały Sad");
        gameState.saveGame();
        System.out.println(gameState.gameInfo());
        System.out.println("==================");
        gameState.changeGameState(2, "Velen");
        gameState.saveGame();
        gameState.changeGameState(3, "Novigrad");
        System.out.println(gameState.gameInfo());
        System.out.println("==================");
        gameState.restoreGame(2);
        System.out.println(gameState.gameInfo());
        System.out.println("==================");
    }
}
