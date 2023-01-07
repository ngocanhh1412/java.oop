public class TestShape {
    public static void main(String[] args) {
        //Test shape
        Shape newShape = new Shape();
        System.out.println("Shape[: " + newShape.toString() + "]");

        //test circle
        Circle2 newcircle = new Circle2();
        newcircle.setRadius(5.0);
        newcircle.setColor("blue");
        newcircle.setFilled(false);
        System.out.println("Circle[: " + newcircle.toString() + ", Circle Area= " + newcircle.getArea()
                + ", Circle Perimeter= " + newcircle.getPerimeter() + "]");

        //test Rectangle
        Rectangle newRec = new Rectangle();
        newRec.setColor("black");
        newRec.setLength(7);
        newRec.setWidth(8);
        System.out.println("Rectangle[: " + newRec.toString() + ", Rectangle Area= " + newRec.getArea()
                + ", Rectangle Perimeter= " + newRec.getPerimeter() + "]");

        //test Square
        Square newSquare = new Square();
        newSquare.setSide(10);
        newSquare.setColor("white");
        System.out.println("Square[: " + newSquare.toString() + ", Square Area= " + newSquare.getArea()
                + ", Square Perimeter= " + newSquare.getPerimeter() + "]");
    }
}
