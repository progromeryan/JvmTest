package headfirst.command.simpleremote;

/**
 * Created by Administrator on 2017/8/4.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command)
    {
        slot = command;
    }

    public void buttonWasPressed()
    {
        slot.execute();
    }
}
