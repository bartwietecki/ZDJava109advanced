package sda.solid.ocp.fixed;

public class ConsoleClientLoggerApp {

    public static void main(String[] args) {
        MessageLogger messageLogger = new ConsoleLogger();
        Logger logger = new Logger(messageLogger);

        try {
            logger.log("aaa");
            logger.log("bbb");
            logger.log("ccc");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
