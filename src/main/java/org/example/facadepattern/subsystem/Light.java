package org.example.facadepattern.subsystem;

public class Light {
    public void dim(int level) {
        System.out.println("Lights dimmed to " + level + "%");
    }
}
