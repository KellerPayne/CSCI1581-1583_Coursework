package Lab03;
import java.util.Scanner;

public class FizzBuzz {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();

        if(testCase % 3 == 0){
            if(testCase % 5 == 0){
                System.out.println("fizzbuzz");
            } else {
                System.out.println("fizz");}
        } else if (testCase % 5 == 0){
            System.out.println("buzz");
        } else{
            System.out.println(testCase);
        }
    }
}
