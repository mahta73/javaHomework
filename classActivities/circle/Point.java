public class Point {
    // instance variables
    private int x;
    private int y;

    // constructors
    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }   

    public Point(Point copy) {
        this.x = copy.x;
        this.y = copy.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // equals and toString
    public String toString() {
        return "( " + this.x + ", " + this.y + " )";
    }
}