package tasks.L4_Array;

import java.util.Arrays;

public class ArrayPrintSneak {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5},{2, 4, 6},{7, 5, 8}};

        int lenght = arr.length * arr[0].length;
        int firstIndex = 0;
        int x = 0;



        for (int i = lenght; i > 0; i--) {
            int residue = lenght - i;
            int increase = (int) ((-1 * Math.signum(residue % arr[0].length)) + Math.signum(residue));
            int a = firstIndex;
            firstIndex = firstIndex + increase;

            int factor = Math.round(firstIndex % 2);
            x = x - ((firstIndex - a) * (2 * factor - 1));

            int secondIndex = x;

            System.out.print(arr[firstIndex][secondIndex] + ", ");
            x = x + (-2 * factor) + 1;

        }

    }
}
