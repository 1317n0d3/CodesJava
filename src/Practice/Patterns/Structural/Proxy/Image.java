package Practice.Patterns.Structural.Proxy;

public class Image implements Graphic{
    String fileName;
    int width;
    int height;

    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public String getFileName() {
        return fileName;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void draw() {
        System.out.println("Draw!");
    }

    public int getExtent() {
        return getHeight() * getWidth();
    }

    public void store() {
        System.out.println("store");
    }

    public void load() {
        System.out.println("Load!!!");
    }
}
