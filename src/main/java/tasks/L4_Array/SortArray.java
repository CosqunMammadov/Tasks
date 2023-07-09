package tasks.L4_Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arrayInt = {1789, 2035, 1899, 1456, 2013};
        int a;
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = i; j < arrayInt.length; j++) {
                if (arrayInt[i] > arrayInt[j]) {
                    a = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}
