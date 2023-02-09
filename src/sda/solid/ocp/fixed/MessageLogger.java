package sda.solid.ocp.fixed;

public interface MessageLogger {
    void log(String message) throws Exception;

    // ten interface będzie ogólnym przepisem na loggera
}
