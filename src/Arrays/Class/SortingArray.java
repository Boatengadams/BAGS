package Arrays.Class;
//Using sort(nameOfArray)
//Using sort(nameOfArray, fromIndex , toIndex)
// sort use the unicode of the arrays to group the numbers
//        Arrays.sort(numbers);


import java.util.Arrays;

public class SortingArray {
    static void main(String[] args) {
        int[] numbers = { 5,2,3,-1,0,4,1};
        Arrays.sort(numbers, 3, 7);
        char[] characters = {'a','z','b','w','c','A','D'};
        Arrays.sort(characters);
        String[] animals = {"Cat", "Dog", "Monkey", "Elephant"};
            Arrays.sort(animals);

        for(int i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i] +" " );
            }
        for(int j = 0 ;  j < characters.length ; j++){
            System.out.print(characters[j] +" " );
        }
        System.out.println(" ");

        for(int a=0 ; a< animals.length; a++)
            System.out.println(animals[a]);
    }
}
