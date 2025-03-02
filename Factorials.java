package Lab03;
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();

        for(int i = number - 1; i > 0; i--){
            number *= i;    
        }

        System.out.println(number);
    }
}
