package Practice.Patterns.Behavioral.Command;

public class StopCompCommand extends Command{
    public StopCompCommand(Computer computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
