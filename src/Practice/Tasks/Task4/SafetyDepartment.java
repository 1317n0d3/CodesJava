package Practice.Tasks.Task4;

public class SafetyDepartment extends Department{
    @Override
    public boolean checkStatement(Statement statement) {
        System.out.println("Отдел безопасности");
        if (statement.getMessage().contains("f")){
            return true;
        }
        return false;
    }
}
