public class Circle2 extends Shape {
    protected double radius;

    public Circle2() {
        super();
        radius = 1.0;
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public String toString() {
        return "Circle["+ super.toString() + ",radius=" + String.valueOf(radius) + "]";
    }
}

