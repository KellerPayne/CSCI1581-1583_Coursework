
public class SalaryEmployee extends Employee {
    private double salary;

    public SalaryEmployee(String name, double salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public double getPayment(){
        return (this.salary / 12) / 2;
    }

    @Override
    public String toString(){
        return String.format("%s, salary:$%.02f", super.toString(), this.salary);
    }
    
}
