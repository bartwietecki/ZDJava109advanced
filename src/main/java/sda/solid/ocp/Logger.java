package sda.solid.ocp;

public class Logger {

    private LogDestination logDestination;

    public Logger(LogDestination logDestination) {
        this.logDestination = logDestination;
    }

    public void log(String logMessage) {
        switch (logDestination) {
            case CONSOLE:
                System.out.println("Writing " + logMessage + " to console.");
                break;
            case DB:
                System.out.println("Writing " + logMessage + " to database.");
                break;
            /**
             * Dołożenie FILE łamie zasadę OCP bo wcześniej mieliśmy 2 opcje zapisywania logów: konsola i baza danych
             * Jeśli mamy np. testy sprawdzające że tylko te dwie opcje mogą być wybrane
             * to po dołożeniu opcji FILE te testy nam się wywalą
             */
            case FILE:
                System.out.println("Newly added writing to file, message: " + logMessage);
                break;
            default:
                throw new IllegalArgumentException("Not supported log destination");
        }
    }
}
