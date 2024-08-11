package org.digitnary.traning.command;

import org.digitnary.traning.component.GarageDoor;

public class GarageDoorOpenCommand implements Command {
   GarageDoor door;
   public GarageDoorOpenCommand(GarageDoor door) {
       this.door = door;
   }
   public void execute() {
       door.garageDoorOpen();
   }

    @Override
    public void undo() {
        door.garageDoorClosed();
    }
}
