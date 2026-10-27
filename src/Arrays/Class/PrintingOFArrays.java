package Arrays.Class;
import java.util.Arrays;
//using the Arrays.toString(numbers)


public class PrintingOFArrays {

    static void main(String[] args) {
        array();
    }

    public static void  array(){
        int[] numbers = {5, 2, 3, -1, 0, 4, 1};
        Arrays.sort(numbers, 3, 7);
        char[] characters = {'a', 'z', 'b', 'w', 'c', 'A', 'D'};
        Arrays.sort(characters);
        String[] animals = {"Cat", "Dog", "Monkey", "Elephant"};
        Arrays.sort(animals);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(characters));
        System.out.println(Arrays.toString(animals));
    }
}
