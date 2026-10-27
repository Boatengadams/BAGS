import java.util.Scanner;

public class Adams {

    static void main(String[] args) {
    sayHi();
    }

    public static void sayHi() {
        final String COMPANY_NAME = "BAGSGRAPHICS";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name :");
        String userName = input.nextLine();

        System.out.println("Enter your age :");
        int age = input.nextInt();

        System.out.println(userName.isEmpty()? "Enter your Name" : "CONGRATULATIONS " + userName +"," +" on your "+ age + "th Birthday " +", Happy Birthday from "+ COMPANY_NAME + "!");

    }




}
