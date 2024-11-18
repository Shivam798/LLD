package org.example.facadepattern;

import org.example.facadepattern.subsystem.*;

public class Main {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Light light = new Light();
        Projector projector = new Projector();
        Screen screen = new Screen();
        HomeTheaterFacade homeTheaterFacade  = new HomeTheaterFacade(amplifier,dvdPlayer,light,projector,screen);
        homeTheaterFacade.watchMovie("Pushpa 2");
        homeTheaterFacade.endMovie();
    }
}
