import java.util.Scanner;

public class CallingFamily{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int minutesOnDevice = 60;
        int numOfFamilyMembers = input.nextInt();
        int minutesPerPerson = minutesOnDevice / numOfFamilyMembers;

        System.out.println(minutesPerPerson);
    }
}