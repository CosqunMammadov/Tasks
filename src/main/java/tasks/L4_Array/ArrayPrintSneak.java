package tasks.L4_Array;

import java.util.Arrays;

public class ArrayPrintSneak {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5},{2,4,6},{3,5,8}};


        for (int i = 0; i < arr.length; i++) {
            int a = Math.round(i%2);
            a = a*(-2);
            int b = Math.abs(a);
            System.out.print(arr[i][b]+", ");
            a++;
            b = Math.abs(a);
            System.out.print(arr[i][b]+", ");
            a++;
            b = Math.abs(a);
            System.out.print(arr[i][b]+", ");

        }

    }
}
