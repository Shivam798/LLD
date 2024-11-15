package org.example.adaptorpattern;

public class Main {
    public static void main(String[] args) {
        Log4j log4j = new Log4jClass();
        Logger logger = new Log4jAdaptor(log4j);
        logger.logInfo("Checking info log");
        logger.logError("Checking error log");
    }
}
