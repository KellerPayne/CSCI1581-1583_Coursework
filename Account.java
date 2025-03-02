public class Account {
    private static int count;
    private String name;
    private String pin;
    private int id;
    private double balance;

    public Account(String name,  String pin){
        this.name = name;
        this.pin = pin;
        this.balance = 0;
        this.id = count;
        count++;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public int getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public boolean isPin(String attempt){
        if(attempt == pin){
            return true;
        } else {
            return false;
        }
    }

    public double withdraw(double amount){
        if(amount <= balance && amount > 0){
            this.balance -= amount;
        }
        return this.balance;
    }

    public String toString(){
        return String.format("Name: %s, Account ID: %d, Balance $%.02f\n", name, id, balance);
    }
}
