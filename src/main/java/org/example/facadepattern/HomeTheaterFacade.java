package org.example.facadepattern;

import org.example.facadepattern.subsystem.*;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Light light;
    private Projector projector;
    private Screen screen;

    public HomeTheaterFacade(Amplifier amplifier,DVDPlayer dvdPlayer, Light light,Projector projector, Screen screen){
        this.amplifier=amplifier;
        this.dvdPlayer=dvdPlayer;
        this.light=light;
        this.projector=projector;
        this.screen=screen;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        light.dim(10);
        screen.down();
        projector.on();
        projector.setWideScreenMode();
        amplifier.on();
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        light.dim(100);
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
