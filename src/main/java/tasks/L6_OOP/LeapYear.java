package tasks.L6_OOP;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        checkYear();

    }
    public static void checkYear(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter year.");
        int userInput= scan.nextInt();
        if (userInput%4!=0)
            System.out.println("Not a leap year.");
        else if (userInput%100==0 && userInput%400!=0)
            System.out.println("Not a leap year.");
        else
            System.out.println("Leap year");
    }
}
