package Practice.Patterns.Behavioral.ChainOfResponsibility;

public abstract class Logger {
    int priority;
    Logger next;

    public Logger(int priority) {
        this.priority = priority;
    }

    public void setNextLogger(Logger next){
        this.next = next;
    }

    public void writeMessage(String message, int level){
        if (level <= priority){
            write(message);
        }
        if (next != null){
            next.writeMessage(message, level);
        }
    }

    public abstract void write(String message);
}
