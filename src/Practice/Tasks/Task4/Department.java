package Practice.Tasks.Task4;

public abstract class Department {
    Department next;

    public void setNext(Department next){
        this.next = next;
    }

    public void acceptStatement(Statement statement){
        if (next != null) {
            if (checkStatement(statement)) {
                next.acceptStatement(statement);
            } else {
                System.out.println("Не одобрено");
            }
        } else {
            if (checkStatement(statement)){
                System.out.println("Одобрено");
            } else {
                System.out.println("Не одобрено");
            }
        }
    }

    public abstract boolean checkStatement(Statement statement);
}
