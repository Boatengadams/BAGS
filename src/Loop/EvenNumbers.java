package Loop;
//A program that print the even numbers from 1 to 100 in increaseing orther

public class EvenNumbers {
    static void main(String[] args) {
        oneTOHundred();
    }

    public static void oneTOHundred(){
//        for(int i = 1; i <= 100; i++)
//        for(int i = 100; i >= 1; i--)
//        for(int i = 100; i >= 1; i-=2)
//        for(int i = 99; i >= 1; i-=2)
//        for(int i = 2; i <= 100; i+=2)
//            if(i%2 != 0 )
//            if(i%2 == 0 )
        int i = 1;
        while (i <= 100){
            if (i%2==0)
                System.out.print(i + " ");
            i++;
        }

    }

}
