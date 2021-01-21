package Practice.Tasks.Task4;

public class PFU extends Department{
    @Override
    public boolean checkStatement(Statement statement) {
        System.out.println("Отдел ПФУ");
        if (statement.getMessage().contains("b")){
            return true;
        }
        return false;
    }
}
