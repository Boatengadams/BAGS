package Arrays.Class;

import java.util.Arrays;
import java.util.Scanner;

// A program that fills an array with n integers entered by the user
public class ArrayEnterByUser {

    static void main(String[] args) {
        System.out.print("How many numbers do you want to:");
        usernumber();
    }


    static void usernumber() {
        int userInput = new Scanner(System.in).nextInt();
        System.out.println("Array of "+ userInput +" created.");

        int[] userArray = new int[userInput];
        System.out.println("Enter your values");
        fillArrayOfIntergers(userArray);
        printArrayOfIntegers(userArray);
    }

    private static void printArrayOfIntegers(int[] userArray) {
        System.out.print("The element are :");
        System.out.println(Arrays.toString(userArray));
    }

    private static void fillArrayOfIntergers(int[] userArray) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < userArray.length; i++)
            userArray[i] = input.nextInt();
    }
}
