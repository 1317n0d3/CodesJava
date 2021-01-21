package Practice.Tasks.Task2;

public class User {
    Command date;
    Command hw;

    public User(Command date, Command hw) {
        this.date = date;
        this.hw = hw;
    }

    public void getDate(){
        date.execute();
    }

    public void getHelloWorld(){
        hw.execute();
    }
}
