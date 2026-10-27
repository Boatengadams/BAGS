package Loop;

import java.util.Scanner;

// A program which displays a string with space after each character
// some text ==> s o m e t e x t
public class StringWithSPace {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        for ( int i = 0 ; i<= str.length() - 1; i++)
            System.out.print(str.charAt(i) + " ");
    }
}
