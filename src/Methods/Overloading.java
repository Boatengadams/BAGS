package Methods;
// writing the same method with different parameters

public class Overloading {
    static void main(String[] args) {
        sayHi();
        System.out.println(sayHi("Adams"));


    }

    public static void sayHi(){
        System.out.println("Hi");
    }

    public static String sayHi(String name){
        return "Hi " + name;
    }
}
