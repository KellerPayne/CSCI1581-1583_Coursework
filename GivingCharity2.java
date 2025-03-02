package Lab02;

import java.util.Scanner;

public class GivingCharity2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pbJars = input.nextInt();
        int jellyJars = input.nextInt();
        int pplToFeed = input.nextInt();

        int pbFactor = 13;
        int jellyFactor = 26;

        int totalSandwiches = (pbJars * pbFactor) + (jellyJars * jellyFactor);

        if (totalSandwiches >= pplToFeed) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}