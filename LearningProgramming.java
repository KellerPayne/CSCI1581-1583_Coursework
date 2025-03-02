import java.util.Scanner;

public class LearningProgramming {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numOfMinutesToSolve = input.nextInt();
        int hour = 60;

        int problemsPerHour = hour / numOfMinutesToSolve;

        System.out.println(problemsPerHour);
    }
}
