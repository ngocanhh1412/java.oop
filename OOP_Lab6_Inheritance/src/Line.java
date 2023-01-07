public class Line {
    private Point begin, end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }


    // Getters and setters of begin point.
    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public double getBeginX() {
        return this.begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public double getBeginY() {
        return this.begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public double[] getBeginXY() {
        return new double[]{this.getBeginX(), this.getBeginY()};
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    //Getters and setters of end point.
    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getEndX() {
        return this.end.getX();
    }

    public void setEndX(double x) {
        this.end.setX(x);
    }

    public double getEndY() {
        return this.end.getY();
    }

    public void setEndY(double y) {
        this.end.setY(y);
    }

    public double[] getEndXY() {

        return new double[]{getEndX(), getEndY()};
    }

    public void setEndXY(double x, double y) {
        this.end.setXY(x, y);
    }

    public double getLength() {
        return Math.sqrt(Math.pow((getEndY() - getBeginY()), 2) + Math.pow((getEndX() - getBeginX()), 2));
    }

    public double getGradient() {
        double deltaX = Math.abs(getEndX() - getBeginX());
        double deltaY = Math.abs(getEndY() - getBeginY());

        return Math.atan2(deltaY, deltaX);
    }

    @Override
    public String toString() {
        return String.format("Line[begin = %s, end = %s]", this.getBegin().toString(), this.getEnd().toString());
    }
}