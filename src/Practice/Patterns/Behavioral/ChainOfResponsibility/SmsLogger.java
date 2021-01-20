package Practice.Patterns.Behavioral.ChainOfResponsibility;

public class SmsLogger extends Logger{
    public SmsLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sms log: " + message);
    }
}
