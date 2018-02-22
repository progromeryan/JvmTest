package headfirst.command.remote;

public interface Command {
	public void execute();
	public void undo();
}
