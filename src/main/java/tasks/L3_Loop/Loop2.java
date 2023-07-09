package tasks.L3_Loop;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int loopLenght=scan.nextInt();
        System.out.println("Enter your numbers");

        int positive=0;
        int negative=0;
        int zero=0;

        for (int i = 0; i < loopLenght; i++) {
            int userNumber=scan.nextInt();
            if (userNumber>0)
                positive++;
            else if(userNumber==0)
                zero++;
            else
                negative++;
        }

        System.out.println("The count of positive "+positive);
        System.out.println("The count of negative "+negative);
        System.out.println("The count of zero "+zero);
    }
}
