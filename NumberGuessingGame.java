//submitted by Keller Payne

import java.util.Random;                                                                                    //import Random class
import java.util.Scanner;                                                                                   //import Scanner class

public class NumberGuessingGame{                                                                            //Declare NumberGuessingGame public class
    public static void main(String[] args){                                                                 //Declare main method
        Scanner input = new Scanner(System.in);                                                             //Declare new input scanner variable
        Random random = new Random();                                                                       //Declare new random variable

        System.out.println("Please enter your first name:");                                              //prompt user to input first name
        String firstName = input.nextLine();                                                                //save user first name in variable

        System.out.println("Please enter your last name:");                                               //prompt user to input last name
        String lastName = input.nextLine();                                                                 //save user last name in variable

        System.out.println("Welcome to the Number Guessing Game " + firstName + " " + lastName + "!");      //message welcoming user to game using their name

        int randomNumber = random.nextInt(10) + 1;                                                    //generates a random number between 1 and 10

        System.out.println("Guess a number between 1 and 10. Enter -1 to quit.");                         //prompt user to guess a number between 1 and 10, advises that -1 will quit game

        int playerNumber = input.nextInt();                                                                 //declare int variable to save number user guesses

        int numAttempts = 1;                                                                                //declares an int variable and intializes it with a value of 1 to count number of attempts before user guesses correct number

        while (playerNumber != -1){                                                                         //while loop to control functionality of game, checks if player number is not equal to randomNumber
            if (playerNumber > randomNumber){                                                               //if statement to check if playerNumber is greater than randomNumber
                System.out.println("Too high! Guess again!");                                              //prompts user that guess is too high compared to randomNumber
                numAttempts++;                                                                              //increments attempts by 1
                playerNumber = input.nextInt();                                                             //takes a new guess
            } else if (playerNumber < randomNumber){                                                        //else if statement to check if playerNumber is less than randomNumber
                System.out.println("Too low! Guess again!");                                              //prompts user that guess is too low compared to randomNumber
                numAttempts++;                                                                              //increments attempts by 1
                playerNumber = input.nextInt();                                                             //takes a new guess
            } else {                                                                                        //else statement to break loop
                break;
            }
        }
        if (playerNumber == randomNumber){                                                                  //if statement to check if playerNumber is equal to randomNumber
            System.out.println("Congratulations! You guessed the number in " + numAttempts + " attempts!"); //prompts user that they guessed the randomNumber in n number attempts
        }
        if (playerNumber == -1){
            System.out.println("You have quit the game. Goodbye!");
        }
    }
}