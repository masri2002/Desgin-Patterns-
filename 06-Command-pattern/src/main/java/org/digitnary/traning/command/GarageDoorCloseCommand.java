package org.digitnary.traning.command;

import org.digitnary.traning.component.GarageDoor;

public class GarageDoorCloseCommand implements Command{
    GarageDoor gd;
    public GarageDoorCloseCommand(GarageDoor gd) {
        this.gd = gd;
    }
    @Override
    public void execute() {
     gd.garageDoorClosed();
    }

    @Override
    public void undo() {
        gd.garageDoorOpen();
    }
}
