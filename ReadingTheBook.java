import java.util.Scanner;

public class ReadingTheBook {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int pages = input.nextInt();
        int days = input.nextInt();
        int dailyPagesToRead = pages / days;
        
        System.out.println(dailyPagesToRead);
    }
}
