
public class CommissionEmployee extends Employee{
    private double commissionRate;
    private double totalSales;

    public CommissionEmployee(String name, double rate, double sales){
        super(name);
        this.commissionRate = rate;
        this.totalSales = sales;
    }

    @Override
    public double getPayment(){
        return this.commissionRate * this.totalSales;
    }

    @Override
    public String toString(){
        return String.format("%s, commission: %.02f @ $%.02f sales", super.toString(), this.commissionRate, this.totalSales);
    }
}
