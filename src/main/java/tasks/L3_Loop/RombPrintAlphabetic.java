package tasks.L3_Loop;

import java.util.Arrays;

public class RombPrintAlphabetic {
    public static void main(String[] args) {
        String[] alphabeticArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        String userInput = "G";
        int index = Arrays.binarySearch(alphabeticArray,userInput);
        int a = index;
        int b = a;

        for (int row = 0; row <= index; row++) {
            int i = 0;
            int j = 0;
            for (int column = 0; column <= index * 2; column++) {
                if (column <= a && column >= b) {
                    if (column < index) {
                        System.out.print(alphabeticArray[0 + i]);
                        i++;
                    } else if (column >= index) {
                        System.out.print(alphabeticArray[i - j]);
                        j++;
                    }
                }else System.out.print(" ");
            }
            a++;
            b--;
            System.out.println();
        }
    }
}
