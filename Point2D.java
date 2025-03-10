public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void moveBy(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public void moveTo(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point2D other){
        double x1 = this.getX();
        double y1 = this.getY();
        double x2 = other.getX();
        double y2 = other.getY();

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return distance;
    }

    public String toString(){
        return String.format("(%.1f, %.1f)", x, y);
    }
}
