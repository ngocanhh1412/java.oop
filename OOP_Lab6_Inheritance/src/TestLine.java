public class TestLine {
    public static void main(String[] args) {
        Point a = new Point(1, 3);
        Point b = new Point(3, 9);

        Line ab = new Line(a, b);

        System.out.println(ab);

        System.out.println(ab.getLength());
        System.out.println(ab.getGradient());
        System.out.println(ab.getEnd());
        ab.setEndXY(5, 5);
        System.out.println(ab);
    }
}