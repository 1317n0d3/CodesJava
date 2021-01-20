package Practice.Patterns.Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String name){
        Shape shape = shapes.get(name);
        if (shape == null){
            switch (name){
                case "circle":
                    shape = new Circle();
                    break;
                case "dot":
                    shape = new Dot();
                    break;
                case "square":
                    shape = new Square();
                    break;
            }
            shapes.put(name, shape);
        }
        return shape;
    }
}
