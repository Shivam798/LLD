package org.example.commandpattern;

//Receiver
public class AirCondition {

    private boolean isOn=false;
    private int temp =24;

    public void turnOnAC(){
        isOn=true;
        System.out.println("AC is "+isOn);
    }

    public void turnOffAC(){
        isOn=false;
        System.out.println("AC is "+isOn);
    }

    public void increaseTemp(){
        temp++;
        System.out.println("Temperature increased to " + temp);
    }

    public void decreaseTemp(){
        temp--;
        System.out.println("Temperature decrease to " + temp);
    }
}
