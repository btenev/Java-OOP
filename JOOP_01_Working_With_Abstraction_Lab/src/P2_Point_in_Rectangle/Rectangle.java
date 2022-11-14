package P2_Point_in_Rectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean isInside(Point p) {
        return p.isGreaterThan(bottomLeft) && p.isLessThan(topRight);
    }
}
