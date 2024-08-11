package org.digitnary.traning.component;

public class GarageDoor {
   String place;
    public GarageDoor(String place) {
        this.place = place;
    }
    public void garageDoorOpen() {
        System.out.println("Garage Door Opened");
    }
    public void garageDoorClosed() {
        System.out.println("Garage Door Closed");
    }

}
