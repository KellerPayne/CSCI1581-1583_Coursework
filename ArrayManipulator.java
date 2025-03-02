/**
 * Author: Keller Payne
 * Student ID: 2645547
 * Description: To complete this assignment, I created methods that iterate through testArray and checks conditions to determine which elements in the array to apply to the calculations required.
 */
import java.util.Arrays;

public class ArrayManipulator {

    public static void main(String[] args) {
        // Your personalized test array
        int[] testArray = {-2, 6, 4, 5, 5, 4, -7}; // Replace with your generated array based on your student ID

        // write code to print the array elemet
        System.out.println(Arrays.toString(testArray));

        // Task 1: Calculate sum of all elements
        System.out.println("Sum of all elements: " + calculate(testArray));

        // Task 2: Calculate sum of only positive elements
        System.out.println("Sum of positive elements: " + calculate(testArray, true));

        // Task 3: Calculate average of positive elements
        System.out.println("Average of positive elements using overloaded method: " + calculate(testArray, "average"));

      
        
    }

    // Implement this method
    public static int calculate(int[] nums) {                       //This method uses a for loop to iterate through the array and add each number at the specified index to the int total variable.
        int total = 0;

        for(int counter = 0; counter < nums.length; counter++){
            total+= nums[counter];
        }

        return total;
    }

    // Overload this method
    public static int calculate(int[] nums, boolean onlyPositives) {            //This method overloads the first by giving another argument. It does the same thing as the first calculate method, except it only adds the positive numbers in the testArray array.
        int total = 0;

        for(int counter = 0; counter < nums.length; counter++){
            if (nums[counter] > 0){
                total += nums[counter];
            }
        }
        
        return total;
    }

    // Overload this method
    public static double calculate(int[] nums, String operation) {              //This method further overloads the method by taking in a third argument. It does the same thing as the first two methods, but this one will find the average when "average" is provided as the third argument.
        int total = 0;
        double numberOfPositives = 0;

        for(int counter = 0; counter < nums.length; counter++){
            if (nums[counter] > 0){
                total += nums[counter];
                numberOfPositives++;
            }
        }
        
        return total / numberOfPositives;
        
    }
        
}
