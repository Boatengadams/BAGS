package Arrays.List;
//A resizable array;
// use add() method
// use get() method
// use set() method to change an item
// use remove() metthod
//use clear()
// use size()
// use sort()
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJava {
    static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();

        names.add("Kofi");
        names.add("Yaw");
        names.add("Ama");
        names.add("Adwoa");
        names.add("Sam");
        names.add(4 ,"Kwaku");
        names.set(4, "Mary");

        System.out.println(names.size());
        names.remove(1);
        System.out.println(names.size());

//        System.out.println(names.get(4));
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);


    }
}
