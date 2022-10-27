package ro.myClass.undo;
public interface Command {
	public void execute();
	public void undo();
}
