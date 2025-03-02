
public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(){
        this.radius = 1;
    }
    
    public String toString(){
        return "Circle";
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    @Override
    public double perimeter(){
        return 2 * Math.PI * this.radius;
    }
}
