package Lab03;

import java.util.Scanner;

public class ReadingTheBook3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int readingSessions = input.nextInt();
        int amountOfPages = input.nextInt();
        int pagesRead = 0;

        for(int count = 0; count <= amountOfPages; count++){
            System.out.println("How many pages did you read?");
            
            pagesRead += input.nextInt();


            int pagesRemaining = amountOfPages - pagesRead;

            if(pagesRemaining <= 0){
                pagesRemaining = 0;
                System.out.println(pagesRemaining);
            }

            System.out.println(pagesRead);
            System.out.println(pagesRemaining);
        }
    }
}
