package tasks.L5_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {


//       findMiddleCharacter();
//        countVowels();
//        printPentagonalNumbers();
//        findSmallestNumber();
//        System.out.println(checkNumbers());
        System.out.println(factorial(5));

    }

    public static void findMiddleCharacter(){

        Scanner scan= new Scanner(System.in);
        String userInput= scan.nextLine();

        if (userInput.length()%2==0)
            System.out.println(userInput.charAt(userInput.length()/2)+" and "+userInput.charAt(userInput.length()/2-1));
        else System.out.println(userInput.charAt(userInput.length()/2));
    }


    public static void countVowels(){

        Scanner scan= new Scanner(System.in);
        String userInput= scan.nextLine();

        int count=0;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i)=='a'||userInput.charAt(i)=='e'||userInput.charAt(i)=='i'||userInput.charAt(i)=='o'||
            userInput.charAt(i)=='u')
                count++;
        }
        System.out.println(count);
    }



    public static void printPentagonalNumbers(){
        int a1=1;
        int a2=5;
        System.out.println(a1);
        System.out.println(a2);
        int count=2;
        while (count<50){
            int c=a2;
            a2=(a2-a1)+3+a2;
            a1=c;
            System.out.println(a2);
            count++;
        }
    }



    public static void findSmallestNumber(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter quantity of number");
        int quantityNumber=scan.nextInt();

        int[] array= new int[quantityNumber];
        System.out.println("Enter your numbers");
        for (int i = 0; i < quantityNumber; i++) {
            array[i]=scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[0]);
    }


    public static boolean checkNumbers() {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        boolean test=true;

        for (int i = 0; i < userInput; i++) {

            if ((userInput%10)%2!=0){
                test= false;
                break;
            }
            userInput= userInput/10;

            if (userInput<10)
                break;
        }
        return test;
    }


    public static int factorial(int i){
        if (i>0) {
            return i * factorial(i - 1);
        }else {
            return 1;
        }
    }
}
