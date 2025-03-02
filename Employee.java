
public abstract class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public abstract double getPayment();

    @Override
    public String toString(){
        return this.name;
    }
       
}
