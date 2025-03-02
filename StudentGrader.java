import java.util.Scanner;

public class StudentGrader {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float testAverage = input.nextFloat();
        float homeworkAverage = input.nextFloat();
        float labAverage = input.nextFloat();

        float finalAverage = (testAverage * 0.4f) + (homeworkAverage * 0.5f) + (labAverage * 0.1f);

        System.out.printf("%.1f %n", finalAverage);
    }
}
