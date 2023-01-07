public class AnotherCircle {
    private double radius;

    public AnotherCircle() {
        radius = 1.0;
    }

    public AnotherCircle(double radius) {
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

    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + "]";
    }
}
