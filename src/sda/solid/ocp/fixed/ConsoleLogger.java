package sda.solid.ocp.fixed;

public class ConsoleLogger implements MessageLogger {
    @Override
    public void log(String message) throws Exception {
        System.out.println("Logging to console: " + message);
    }
}
