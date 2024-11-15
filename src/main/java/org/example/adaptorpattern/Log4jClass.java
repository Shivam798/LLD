package org.example.adaptorpattern;

public class Log4jClass implements Log4j{

    @Override
    public void info(String message) {
        System.out.println("Log4j info message "+message);
    }

    @Override
    public void error(String message) {
        System.out.println("Log4j error message "+message);
    }
}
