package headfirst.command.party;

/**
 * Created by Administrator on 2017/8/14.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {

    }
    Command noCommand = new NoCommand();


}
