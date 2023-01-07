package AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else {
            return new Square();
        }
    }
}
