// Question: How can an anonymous array and regular arrays store and print values?
package Arrays;

import java.util.ArrayList;

//collection of variable of the same datatype
// An array is an object in Java
// ArrayList === std::vector
//Array without a variable referencing it
// new.Scanner(System.in).nextLine();
//    int [] num = new int[5];
//    num [0]  = 9;
//    int [] numbers = {3,6,9};
//    new int[] {1,2,3,4,5,6};

public class AnonymousArrays{
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0]=2;
        numbers[2]=8;
        numbers[1]=4;
        for(int i = 0; i<numbers.length; i++  )
            System.out.print(numbers[i] + " ");


        int[] numbs = {19,28,37,46,55};
        for (int j = 0; j< numbs.length; j++ )
            System.out.print(numbs[j] + " ");

        char[] character = { 'a', 'b','c'};
//        System.out.println(character);
        for(int x = 0; x<character.length; x++)
            System.out.print(character[x] + " ");


    }


}
