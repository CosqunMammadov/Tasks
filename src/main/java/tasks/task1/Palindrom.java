package tasks.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] strCharArray = str.toCharArray();
        String reversedString = "";


        for (int i = strCharArray.length - 1; i >= 0; i--) {
           reversedString= reversedString + strCharArray[i];
        }

        System.out.println(str.equals(reversedString) ? "Yes" : "No");

    }
}
