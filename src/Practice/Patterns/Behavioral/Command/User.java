package Practice.Patterns.Behavioral.Command;

public class User {
    Command startComp;
    Command stopComp;
    Command resetComp;
    CommandHistory commandHistory = new CommandHistory();

    public User(Command startComp, Command stopComp, Command resetComp) {
        this.startComp = startComp;
        this.stopComp = stopComp;
        this.resetComp = resetComp;
    }

    public void startComputer(){
        startComp.execute();
        commandHistory.push(startComp);
    }
    public void stopComputer(){
        stopComp.execute();
        commandHistory.push(stopComp);
    }
    public void resetComputer(){
        resetComp.execute();
        commandHistory.push(resetComp);
    }

    public CommandHistory getCommandHistory() {
        return commandHistory;
    }
}
