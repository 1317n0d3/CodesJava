package start;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void mew() {
        System.out.println(name + ": mew!");
    }

    public void mew(int n){
        System.out.println(name + ": mew" + "-mew".repeat(n - 1) + "!");
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}
