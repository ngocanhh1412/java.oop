public class Cylinder3 {
    private Circle3 base;
    private double height;

    public Cylinder3() {
        base = new Circle3();
        height = 1.0;
    }

    public Cylinder3(double height) {
        this.height = height;
    }


    public double getHeight() {
        return height;
    }


    public double getArea() {
        return 2 * Math.PI * base.getArea() * height + 2 * base.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of" + super.toString() + "height=" + height;
    }
}