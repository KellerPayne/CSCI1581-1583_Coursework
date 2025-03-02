
public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, double rate, double hours){
        super(name);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    @Override
    public double getPayment(){
        return this.hourlyRate * this.hoursWorked;
    }

    @Override
    public String toString(){
        return String.format("%s, hourly: $%.02f @ %.02f hours", super.toString(), this.hourlyRate, this.hoursWorked);
    }
}
