package Practice.Patterns.Creational.Singleton;

public final class Singleton {
    private static Singleton singleton;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static synchronized Singleton getInstance(String data){
        if (singleton == null){
            singleton = new Singleton(data);
        }

        return singleton;
    }

    public String getData() {
        return data;
    }
}
