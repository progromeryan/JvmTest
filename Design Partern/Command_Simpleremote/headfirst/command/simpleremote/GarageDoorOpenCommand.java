package headfirst.command.simpleremote;

/**
 * Created by Administrator on 2017/8/4.
 */
public class GarageDoorOpenCommand implements  Command
{
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
