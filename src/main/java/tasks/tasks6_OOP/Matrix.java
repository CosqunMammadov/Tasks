package tasks.tasks6_OOP;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter the number: ");
        int userInput= scan.nextInt();

        for (int i = 0; i < userInput; i++) {
            for (int j = 0; j < userInput; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
