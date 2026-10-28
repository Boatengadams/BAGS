// Question: How can a program read integers into an array and print them?
package Arrays.Class;

import java.util.Arrays;
import java.util.Scanner;

// A program that fills an array with n integers entered by the user
public class ArrayEnterByUser {

    public static void main(String[] args) {
        System.out.print("How many numbers do you want to:");
        usernumber(new Scanner(System.in));
    }


    static void usernumber(Scanner input) {
        int userInput = input.nextInt();
        if (userInput < 0) {
            System.out.println("The number of values cannot be negative.");
            return;
        }
        System.out.println("Array of "+ userInput +" created.");

        int[] userArray = new int[userInput];
        System.out.println("Enter your values");
        fillArrayOfIntergers(userArray, input);
        printArrayOfIntegers(userArray);
    }

    private static void printArrayOfIntegers(int[] userArray) {
        System.out.print("The element are :");
        System.out.println(Arrays.toString(userArray));
    }

    private static void fillArrayOfIntergers(int[] userArray, Scanner input) {
        for(int i = 0; i < userArray.length; i++)
            userArray[i] = input.nextInt();
    }
}
