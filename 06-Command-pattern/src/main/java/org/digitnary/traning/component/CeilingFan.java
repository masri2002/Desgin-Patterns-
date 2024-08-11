package org.digitnary.traning.component;

public class CeilingFan {
    String place;

    public CeilingFan(String place) {
        this.place = place;
    }
    public void on(){
        System.out.println("CeilingFan on");
    }
    public void off(){
        System.out.println("CeilingFan off");
    }
}
