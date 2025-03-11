public class App {
    public static void main(String[] args) {
        Logger loggerChain = LoggerChain.getChainOfLoggers();
        loggerChain.logMessage(LogLevel.INFO, "This is an information.");
        loggerChain.logMessage(LogLevel.DEBUG, "This is a debug information.");
        loggerChain.logMessage(LogLevel.ERROR, "This is an error information.");
    }
}
