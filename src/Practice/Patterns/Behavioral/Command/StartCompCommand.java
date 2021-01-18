package Practice.Patterns.Behavioral.Command;

public class StartCompCommand extends Command{
    public StartCompCommand(Computer computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.start();
    }
}
