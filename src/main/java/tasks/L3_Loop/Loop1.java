package tasks.L3_Loop;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        multiplicationTable(scan.nextInt());

//        factorialValue(scan.nextInt());

//        fibonacciNumbers(scan.nextInt());

//        reversedDigit(scan.nextInt());

//        armstrongNumbers();

        armstrongNumbers1();

//        interestingNumbers();
    }





    public static void multiplicationTable (int userInput) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(userInput + " * " + i + " = " + userInput * i);
        }
    }

    public static void factorialValue(int userInput){
        int result = 1;
        for (int i = 1; i <= userInput; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    public static void fibonacciNumbers(int userInput) {
        int result=1;
        int result2=0;
        while (result<userInput){
            int x=result;
            result=result+result2;
            result2=x;
            if (result==1){
                System.out.println(0);
                System.out.println(1);
            }
            if (result>userInput)
                break;
            System.out.println(result);
        }
    }

    public static void reversedDigit(int userInput) {

        while (userInput>0){
            System.out.print(userInput%10);
            userInput/=10;
        }
    }


    public static  void armstrongNumbers(){


        for (int i = 0; i <= 500; i++) {
            int b;

            if (i*10>=1000){
                b=((i%10)*(i%10)*(i%10)) + ((i/10%10)*(i/10%10)*(i/10%10)) + (i/100)*(i/100)*(i/100);   // Uyğun olaraq təklik, onluq, yüzlük.
            } else if (i*10>=100) {
                b=((i%10)*(i%10)*(i%10)) + ((i/10%10)*(i/10%10)*(i/10%10));
            }else
                b=((i%10)*(i%10)*(i%10));


            if (b==i)
                System.out.println(i);
        }

    }

    public static  void armstrongNumbers1(){
        for (int i = 0; i < 500; i++) {
            int b=0;
            String str= Integer.toString(i);
            for (int j = 0; j < str.length(); j++) {
               int a=Integer.parseInt(String.valueOf(str.charAt(j)));
               b= b + (int) Math.pow(a,3);
            }
            if (b==i)
                System.out.println(i);
        }
    }


    public static void interestingNumbers(){
        for (int i = 1001; i < 10000; i++) {

            int a=i/100;
            int a1=a/10+a%10;

            int b= i%100;
            int b1= b/10+b%10;

            if (a1==b1)
                System.out.println(i);
        }
    }
}

