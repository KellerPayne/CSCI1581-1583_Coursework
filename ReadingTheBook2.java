package Lab02;

import java.util.Scanner;

public class ReadingTheBook2 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int days = 30;

        int numPages = input.nextInt();
        int pagesPerDay = input.nextInt();

        int daysNeeded = (numPages / pagesPerDay);

        if (daysNeeded <= days){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
