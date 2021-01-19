package Practice.Patterns.Behavioral.TemplateMethod;

public abstract class C {
    public void templateMethod(){
        System.out.println("1");
        System.out.println("2");
        differ();
        System.out.println("4");
    }
    public abstract void differ();
}
