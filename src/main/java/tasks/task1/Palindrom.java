package tasks.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] Acharmas = str.toCharArray();
        String reversedString = "";


        for (int i = Acharmas.length - 1; i >= 0; i--) {
           reversedString= reversedString + Acharmas[i];
        }

        System.out.println(str.equals(reversedString) ? "Yes" : "No");

    }
}
