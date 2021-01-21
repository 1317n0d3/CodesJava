package Practice.Tasks.Task4;

public class Dekanat extends Department{
    @Override
    public boolean checkStatement(Statement statement) {
        System.out.println("Отдел деканата");
        if (statement.getMessage().contains("a")){
            return true;
        }
        return false;
    }
}
