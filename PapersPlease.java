import java.util.Scanner;

public class PapersPlease {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        boolean passport = input.nextBoolean();
        boolean driversLicense = input.nextBoolean();
        boolean birthCertificate = input.nextBoolean();

        if(passport == true){
            System.out.println(true);
        } else if(driversLicense & birthCertificate == true){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
