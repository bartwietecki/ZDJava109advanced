package sda.solid.ocp;

public enum LogDestination {
    CONSOLE,
    DB,
    /**
     * Nowy klient chce zapisywać do pliku
     */
    FILE
}
