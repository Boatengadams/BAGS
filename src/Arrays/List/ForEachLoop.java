// Question: How can an enhanced for loop visit each array value with its index?
package Arrays.List;
//forEach Loop
// for ( int items : arr)
//A program  to print the element of an array with their index using the ForEach method;
public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {5,7,9,2,4};
        int i = 0;
        for(int item : arr)
            System.out.println(item + " " + i++);
    }
}
