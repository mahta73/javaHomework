public class CircleOnPlane {
    // static variable
    private static int counter = 0;

    // instance variables
    private double radius;
    private Point center;
    private String id;

    // constructors
    public CircleOnPlane() {
        radius = 0.0;
        center = new Point(0, 0);
        counter++;
        id = "circle" + counter;
    }

    public CircleOnPlane(double radius, Point center) {
        this.radius = radius;
        this.center = new Point(center);

        counter++;
        id = "circle" + counter;
    } 

    public CircleOnPlane(CircleOnPlane copy) {
        this.radius = copy.radius;
        this.center = new Point(copy.center);
        this.id = copy.id;
    }

    // accessor and mutator methods
    public double getRadius() {
        return this.radius;
    }
    public Point getCenter() {
        return new Point(center);
    }
    public String getId() {
        return id;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void setCenter(Point newCenter) {
        this.center = new Point(newCenter);
    }


    // eqauls, toString

    public String toString() {
        return (id + " with radius " + radius + " and center " + center);
    }

    // main method
    public static void main(String[] args) {
        // local variables
        CircleOnPlane one, two;
        one = new CircleOnPlane();

        two  = new CircleOnPlane(5.0, new Point(4, 3));
        System.out.println(one);
        System.out.println(two);

        Point myPoint = two.setX(10);
    }
}