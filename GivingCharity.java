import java.util.Scanner;

public class GivingCharity {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int peanutButterJar = input.nextInt();
        int jellyJar = input.nextInt();
        
        int peopleFed = (peanutButterJar * 13) + (jellyJar * 26);

        System.out.println(peopleFed);
    }
}
