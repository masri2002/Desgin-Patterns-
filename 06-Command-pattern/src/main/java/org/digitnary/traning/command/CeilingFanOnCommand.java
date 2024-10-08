package org.digitnary.traning.command;

import org.digitnary.traning.component.CeilingFan;

public class CeilingFanOnCommand implements Command {
    CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
