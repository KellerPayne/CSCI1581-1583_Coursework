import java.util.Scanner;

public class ASCIIEncodings {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();
        int input4 = input.nextInt();
        int input5 = input.nextInt();
        int input6 = input.nextInt();

        System.out.print(Character.toString(input1));   
        System.out.print(Character.toString(input2));
        System.out.print(Character.toString(input3));
        System.out.print(Character.toString(input4));
        System.out.print(Character.toString(input5));
        System.out.print(Character.toString(input6));
    }
}
