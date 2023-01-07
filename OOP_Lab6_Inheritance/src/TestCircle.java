public class TestCircle {
    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder
        // with default color , radius , and height
        Cylinder cylinder1 = new Cylinder();
        cylinder1.toString();
        System.out.println(" Cylinder : " + " radius = " + cylinder1.getRadius() + " height = "
                + cylinder1.getHeight() + " base area = " + cylinder1.getArea()
                + " volume = " + cylinder1.getVolume());
        // Declare and allocate a new instance of cylinder
        // specifying height , with default color and radius
        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Cylinder : " + " radius = " + cylinder2.getRadius()
                + " height = " + cylinder2.getHeight() + " base area = " + cylinder2.getArea()
                + " volume = " + cylinder2.getVolume());
        // Declare and allocate a new instance of cylinder
        // specifying radius and height , with default color
        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println(" Cylinder : " + " radius = " + cylinder3.getRadius()
                + " height = " + cylinder3.getHeight() + " base area = " + cylinder3.getArea()
                + " volume = " + cylinder3.getVolume());

    }
}
