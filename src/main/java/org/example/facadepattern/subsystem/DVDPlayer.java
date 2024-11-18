package org.example.facadepattern.subsystem;

public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is on");
    }
    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
    public void stop() {
        System.out.println("DVD Player stopped");
    }
    public void eject() {
        System.out.println("DVD Player ejecting");
    }
    public void off() {
        System.out.println("DVD Player is off");
    }
}
