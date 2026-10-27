package Arrays.Class;

import java.util.Arrays;

//Using the Arrays.equals(number1, number2);
public class ComparingArrays {
    static void main(String[] args) {
        int[]numbers1={5,4,3,2,1,0,-1};
        int[]numbers2={5,4,3,2,1,0,-1};
        int[]numbers3={1,2,3,7,8,1};
//        System.out.println(numbers1==numbers2);
//        this will compare their address not the values
        System.out.println(Arrays.equals(numbers1,numbers2));
        System.out.println(Arrays.equals(numbers1,numbers3));

    }
}
