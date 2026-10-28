// Question: How can a program print a string in reverse order?
package Loop;

import java.util.Scanner;

// A program that display the reverse of a string
// ADAMS ==> SMADA
public class ReverseOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for (int i = str.length()-1; i>=0; i--)
            System.out.print(str.charAt(i)+ " ");
    }
}
