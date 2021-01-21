package Practice.Tasks.Task4;

public class ResourcesDepartment extends Department{
    @Override
    public boolean checkStatement(Statement statement) {
        System.out.println("Отдел кадров");
        if (statement.getMessage().contains("c")){
            return true;
        }
        return false;
    }
}
