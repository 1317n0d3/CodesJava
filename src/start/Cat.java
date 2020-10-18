package start;

public class Cat implements Meowable{
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println(name + ": mew!");
    }

    public void meow(int n){
        System.out.println(name + ": mew" + "-mew".repeat(n - 1) + "!");
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}
