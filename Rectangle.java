
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(){
        this.width = 1;
        this.length = 1;
    }

    public String toString(){
        return "Rectangle";
    }

    @Override
    public double area(){
        return this.width * this.length;
    }

    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
}
