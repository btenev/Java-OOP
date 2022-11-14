package P2_Point_in_Rectangle;

public class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isGreaterThan (Point p) {
        return x >= p.x && y >= p.y;
    }

    public boolean isLessThan (Point p) {
        return x <= p.x && y <= p.y;
    }

}
