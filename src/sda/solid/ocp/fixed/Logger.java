package sda.solid.ocp.fixed;

public class Logger {
    // klasa właściwa, w której naszego loggera sobie przekażemy

    private MessageLogger messageLogger;

    public Logger(MessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }

    /**
     * Teraz mamy ogólną metodę log, która będzie przekazywać komunikaty
     * które chcemy zapisać do zainicjowanego w konstruktorze loggera
     */
    public void log(String message) throws Exception {
        messageLogger.log(message);
    }
}

