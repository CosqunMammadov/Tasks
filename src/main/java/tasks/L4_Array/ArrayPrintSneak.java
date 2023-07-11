package tasks.L4_Array;

import java.util.Arrays;

public class ArrayPrintSneak {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5}, {2, 4, 6}, {7, 5, 8}};

        int lenght = arr.length * arr[0].length;
        int firstIndex = 0;
        int secondIndex = -1;



        for (int i = lenght; i > 0; i--) {
            int residue = lenght - i;        //0, 1, 2, 3, 4, 5, 6, 7, 8

            int increase = (int) ((-1 * Math.signum(residue % arr[0].length)) + Math.signum(residue));
            int a = firstIndex;
            firstIndex = firstIndex + increase;

            int factor = (int) Math.signum(firstIndex % 2);
            secondIndex = secondIndex + ((-2 * factor + 1) * (a - firstIndex + 1));


            System.out.print(arr[firstIndex][secondIndex] + ", ");

        }

    }
}
