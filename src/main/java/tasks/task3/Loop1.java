package tasks.task3;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        multiplicationTable(scan.nextInt());

//        factorialValue(scan.nextInt());

//        fibonacciNumbers(scan.nextInt());

//        reversedDigit(scan.nextInt());

        armstrongNumbers();
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
                b=((i%10)*(i%10)*(i%10)) + ((i/10%10)*(i/10%10)*(i/10%10)) + (i/100)*(i/100)*(i/100); //Təklik, onluq, yüzlük
            } else if (i*10>=100) {
                b=((i%10)*(i%10)*(i%10)) + ((i/10%10)*(i/10%10)*(i/10%10));
            }else
                b=((i%10)*(i%10)*(i%10));


            if (b==i)
                System.out.println(i);
        }

    }
}

