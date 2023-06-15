package tasks.tasks4Array;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter array lenght");
        int n= scan.nextInt();
        int[] array= new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            array[i]=scan.nextInt();
        }

        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] subArray= Arrays.copyOfRange(array,i,j+1);
                if (sumIntArray(subArray)<0)
                    count++;
            }
        }
        System.out.println(count);
    }


    public static int sumIntArray(int[] intArray){
        int sum=0;
        for (int i : intArray) {
            sum += i;
        }
        return sum;
    }


}
