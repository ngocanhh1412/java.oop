public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] xy = new int[2];
        xy[1] = this.x;
        xy[2] = this.y;

        return xy;
    }

    public int[] setXY(int x, int y) {
        int[] xy = new int[2];
        xy[1] = x;
        xy[2] = y;

        return xy;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(MyPoint another) {
        return Math.sqrt((this.x - another.getX()) * (this.x - another.getX()) + (this.y - another.getY()) * (this.y - another.getY()));
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
