public class Car{
    private String make;        //instance variable for Car object's make
    private String model;       //instance variable for Car object's model
    private int year;           //instance variable for Car object's year
    private double fuelLevel;   //instance variable for Car object's fuelLevel

    public Car(){               //default constructor that creates a 2022 Honda Passport with a full tank of gas
        this.make = "Honda";
        this.model = "Passport";
        this.year = 2022;
        this.fuelLevel = 100.0;
    }

    public Car(String make, String model, int year, double fuelLevel){      //constructor that takes parameters and sets make, model, year, and fuel level to those parameters
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelLevel = fuelLevel;
    }

    public String getMake(){        //getter method to return Car object's make
        return this.make;
    }

    public String getModel(){       //getter method to return Car object's model
        return this.model;
    }

    public int getYear(){       //getter method to return Car object's year
        return this.year;
    }

    public double getFuelLevel(){       //getter method to return Car object's fuel level
        return this.fuelLevel;
    }

    public void setMake(String make){                                           //setter method to set Car object's make as long as parameter isn't null or an empty string
        if (make == null || make == ""){
            System.out.println("Error! Must specify the make of the car.");
        } else {
            this.make = make;
        }
    }

    public void setModel(String model){                                         //setter method to set Car object's model as long as parameter isn't null or an empty string
        if (model == null || model == ""){
            System.out.println("Error! Must specify the model of the car.");
        } else {
            this.model = model;
        }
    }

    public void setYear(int year){       //setter method to set Car object's year as long as the parameter is between 1900 and 2024
        if (year < 1900 || year > 2024){
            System.out.println("Error! Year cannot be before 1900 or after 2024! Please enter a valid year.");
        } else {
            this.year = year;
        }
    }

    public void setFuelLevel(double fuelLevel){      //setter method to set Car object's fuel level as long as the parameter is between 0.0 and 100.0
        if(fuelLevel < 0.0 || fuelLevel > 100.0){
            System.out.println("Error! Fuel level cannot be below 0.0 or above 100.0! Please enter a valid fuel level!");
        } else {
            this.fuelLevel = fuelLevel;
        }
    }

    public void refuel(double amount){                        //refuel method to increase Car object's fuel level by a given amount as long as the amount plus the current fuel level is less than or equal to 100.0 or greater than 0.0
        if (this.fuelLevel + amount <= 100.0 && amount > 0){
            this.fuelLevel += amount;
        }else{
            System.out.println("You can only add " + (100.0 - this.fuelLevel) + " of fuel to the car!");
        }
    }

    public void drive(double distance){          //drive method that decreases fuel level of Car object based on a fuel consumption rate of 5% of the distance parameter
        double fuelBurned = distance * 0.05;
        if(fuelBurned < this.fuelLevel){
            this.fuelLevel -= fuelBurned;
        } else {
            System.out.println("Not enough fuel to drive that distance!");
        }
    }

    public String toString(){                                                                                        //toString override method that returns a string representation of Car object's details in given format
        return String.format("Make: %s, Model %s, Year: %d, Fuel Level: %.1f", make, model, year, fuelLevel);
    }
}