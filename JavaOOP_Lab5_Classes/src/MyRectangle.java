public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft.setX(x1);
        topLeft.setY(y1);
        bottomRight.setX(x2);
        bottomRight.setY(y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;

    }

    public MyPoint getTopRight() {
        MyPoint topRight = new MyPoint();
        topRight.setX(bottomRight.getX());
        topRight.setY(topLeft.getY());

        return topRight;
    }

    public MyPoint getBottomLeft() {
        MyPoint bottomLeft = new MyPoint();
        bottomLeft.setX(topLeft.getX());
        bottomLeft.setY(bottomRight.getY());

        return bottomLeft;
    }

    public String toString() {
        return "MyTriangle[topLeft=" + topLeft.toString() + ", bottomRight=" + bottomRight.toString() + "]";
    }

    public double getPerimeter() {
        return 2 * ( topLeft.distance(getTopRight()) + getTopRight().distance(bottomRight) );
    }

    public double getArea() {
        return topLeft.distance(getTopRight()) * getTopRight().distance(bottomRight);
    }
}
