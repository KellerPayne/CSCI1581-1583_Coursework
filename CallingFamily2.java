package Lab02;

import java.util.Scanner;

public class CallingFamily2 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int minutesOnDevice = 60;
        int numFamilyMembers = input.nextInt();
        int timePerCall = 10;

        int numOfCalls = numFamilyMembers * timePerCall;

        if (numOfCalls <= minutesOnDevice){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
