package Practice.Tasks.Task4;

public class Rectorat extends Department{
    @Override
    public boolean checkStatement(Statement statement) {
        System.out.println("Отдел ректора");
        if (statement.getMessage().contains("d")){
            return true;
        }
        return false;
    }
}
