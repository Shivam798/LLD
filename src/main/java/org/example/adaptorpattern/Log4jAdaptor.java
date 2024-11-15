package org.example.adaptorpattern;

public class Log4jAdaptor implements Logger{

    private Log4j log4j;

    public Log4jAdaptor(Log4j log4j){
        this.log4j=log4j;
    }

    @Override
    public void logInfo(String message) {
        log4j.info(message);
    }

    @Override
    public void logError(String message) {
        log4j.error(message);
    }
}
