package Loop;

public class nestedLoop {
    static void main(String[] args) {loop();}

    public static void loop(){
        for(int i = 1; i <= 5 ; i++){
            for(int j =1; j<=i; j++ )
                System.out.print("*");
//                System.out.println(i + " " + j);
            System.out.println();
        }
    }

}


