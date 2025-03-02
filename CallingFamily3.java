package Lab03;

import java.util.Scanner;

public class CallingFamily3 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //user inputs amount of calls he would like to make.
        int calls = input.nextInt();

        //user inputs total amount of Minutes he has.
        int totalMinutes = input.nextInt();

        //counter counts the number of loops we will do.
        for(int counter = 0; counter < calls; counter++){
        
            //ask user for how many minutes the call took.
            System.out.println("How many minutes were used?");

            int minutesUsed = input.nextInt();
            
            //update totalMinutes
            totalMinutes = totalMinutes - minutesUsed;
        
            if(totalMinutes <= 0){
                //ensure that totalMinutes is not negative
                //make it equal to 0
                totalMinutes = 0;
            }

        System.out.println(totalMinutes);
       }
    }
}
