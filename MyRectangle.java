public class MyRectangle {
    
    private MyPoint topLeft;
    private MyPoint bottomRight;
    //no argument constructor
    public MyRectangle() {
        this.topLeft = new MyPoint(0, 0);
        this.bottomRight = new MyPoint(0, 0);
    }
    //parametrized constructor
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
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
    public int getWidth() {
        return Math.abs(topLeft.getX() - bottomRight.getX());
    }
    public int getLength() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }
    public double getArea() {
        return getWidth() * getLength();
    }
    public double getPerimeter() {
        return 2 * (getWidth() + getLength());
    }
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
    