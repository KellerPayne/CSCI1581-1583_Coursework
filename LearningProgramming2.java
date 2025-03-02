package Lab02;

import java.util.Scanner;

public class LearningProgramming2 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int timeAssigned = 60;

        int minPerProblem = input.nextInt();
        int numProblems = input.nextInt();

        int totalTime = minPerProblem * numProblems;

        if (totalTime <= timeAssigned){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
