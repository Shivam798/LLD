package org.example.facadepattern.subsystem;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier is on");
    }
    public void setSurroundSound() {
        System.out.println("Amplifier surround sound is on");
    }
    public void setVolume(int level) {
        System.out.println("Amplifier volume set to " + level);
    }
    public void off() {
        System.out.println("Amplifier is off");
    }
}
