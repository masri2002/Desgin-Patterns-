package org.digitnary.traning;

import org.digitnary.traning.command.*;
import org.digitnary.traning.component.CeilingFan;
import org.digitnary.traning.component.GarageDoor;
import org.digitnary.traning.component.Light;
import org.digitnary.traning.component.Stereo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//       RemoteControl remoteControl = new RemoteControl();
//        Light livingRoomLight = new Light("Living Room");
//        Light kitchenLight = new Light("“Kitchen”");
//        CeilingFan ceilingFan= new CeilingFan("“Living Room”");
//        GarageDoor garageDoor = new GarageDoor("");
//        Stereo stereo = new Stereo("Living Room");
//
//
//        LightOnCommand livingRoomLightOn =
//                new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff =
//                new LightOffCommand(livingRoomLight);
//        LightOnCommand kitchenLightOn =
//                new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenLightOff =
//                new LightOffCommand(kitchenLight);
//        CeilingFanOnCommand ceilingFanOn =
//                new CeilingFanOnCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff =
//                new CeilingFanOffCommand(ceilingFan);
//        GarageDoorOpenCommand garageDoorUp =
//                new GarageDoorOpenCommand(garageDoor);
//        GarageDoorCloseCommand garageDoorDown =
//                new GarageDoorCloseCommand(garageDoor);
//        StereoOnWithCDCommand stereoOnWithCD =
//                new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOff =
//                new StereoOffCommand(stereo);
//
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
//        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
//        System.out. println(remoteControl);
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.onButtonWasPushed(2);
//        remoteControl.offButtonWasPushed(2);
//        remoteControl.onButtonWasPushed(3);
//        remoteControl.offButtonWasPushed(3);

     RemoteControl remoteControl = new RemoteControl();
     Light livingRoomLight = new Light("Living Room");
     LightOnCommand livingRoomLightOn =
             new LightOnCommand(livingRoomLight);
     LightOffCommand livingRoomLightOff =
             new LightOffCommand(livingRoomLight);
     remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
     remoteControl.onButtonWasPushed(0);
     remoteControl.offButtonWasPushed(0);
     System.out.println(remoteControl);
     remoteControl.undoButtonWasPushed();
     remoteControl.offButtonWasPushed(0);
     remoteControl.onButtonWasPushed(0);
     System.out.println(remoteControl);
     remoteControl.undoButtonWasPushed();
    }
}