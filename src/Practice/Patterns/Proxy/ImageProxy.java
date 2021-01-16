package Practice.Patterns.Proxy;

public class ImageProxy implements Graphic{
    Image image;

    public ImageProxy(){

    }

    public ImageProxy(Image image) {
        this.image = image;
    }

    @Override
    public void draw() {
        if (image == null)
            System.out.println("Image not load!");
        else
            image.draw();
    }

    @Override
    public int getExtent() {
        if (image == null)
            return 0;
        else
            return image.getExtent();
    }

    @Override
    public void store() {
        System.out.println("store");
    }

    @Override
    public void load() {
        System.out.println("Load!!!");
    }
}
