
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(){
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public String toString(){
        return "Triangle";
    }

    @Override
    public double area(){
        double s = (this.a + this.b + this.c) / 2;
        return Math.sqrt(s * ((s - this.a) * (s - this.b) * (s - this.c)));
    }

    @Override
    public double perimeter(){
        return this.a + this.b + this.c;
    }
}
