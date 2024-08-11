package org.digitnary.traning.component;

public class Stereo {
   String place;
    public Stereo(String place) {
        this.place=place;
    }

    public void on(){
        System.out.println("Stereo on");
    }
    public void off(){
        System.out.println("Stereo off");
    }
    public void setVolume(int volume){
        System.out.println("Stereo volume " + volume);
    }
    public void setCd(){
        System.out.println("Stereo setCd");
    }
    public void setDvd(){
        System.out.println("Stereo setDvd");
    }
    public void setRadio(){
        System.out.println("Stereo setRadio");
    }
}
