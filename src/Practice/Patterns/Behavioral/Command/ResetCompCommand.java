package Practice.Patterns.Behavioral.Command;

public class ResetCompCommand extends Command{
    public ResetCompCommand(Computer computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.reset();
    }
}
