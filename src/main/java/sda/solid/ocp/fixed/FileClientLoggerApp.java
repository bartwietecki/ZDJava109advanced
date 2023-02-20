package sda.solid.ocp.fixed;

public class FileClientLoggerApp {

    public static void main(String[] args) {
        MessageLogger  messageLogger = new FileLogger();
        Logger logger = new Logger(messageLogger);

        try {
            logger.log("xxx");
            logger.log("yyy");
            logger.log("zzz");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
