public class TestPoint2D {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(3, 9);
        System.out.println("Point2D[: " + p2.getX() + ", " + p2.getY() + "]");
        Point3D p3 = new Point3D(9, 5, 7);
        System.out.println("Point3D[: " + p3.getX() + ", " + p3.getY() + ", " + p3.getZ() + "]");
    }
}
