package org.digitnary.traning.component;

public class Light {
    String place;
    public Light(String place) {
        this.place = place;
    }
    public void on(){
        System.out.println( place+" Light on");
    }
    public void off(){
        System.out.println(place + " Light off");
    }
}
