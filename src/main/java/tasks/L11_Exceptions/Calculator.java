package tasks.L11_Exceptions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double userInput1 = scan.nextInt();
        double userInput2 = scan.nextInt();

        if (userInput1 - ((int) userInput1) != 0 || userInput2 - ((int) userInput2) != 0)
            System.out.println("Daxil edilən ədəd düzgün formatda deyil");

    }

    public int divide(int userInput1, int userInput2){
        int v = 0;
        try {
            v = (int) (userInput1 / userInput2);
        }catch (ArithmeticException e){
            System.out.println("Sıfıra bölmək olmaz");
        }
        return v;
    }
}
