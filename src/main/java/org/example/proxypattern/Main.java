package org.example.proxypattern;

public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("Image 1");
        Image img2 = new ProxyImage("Image 2");

        System.out.println("First call to display image1:");
        img1.display();

        System.out.println("\nSecond call to display image1:");
        img1.display();

        System.out.println("\nFirst call to display image2:");
        img2.display();
    }
}
