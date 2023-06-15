package tasks.tasks4Array;

import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[][] array= new int[6][6];
        System.out.println("Enter elements");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j]= scan.nextInt();
            }
        }
        int sum1, sum2, sum3, max=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum1=array[i][j]+array[i][j+1]+array[i][j+2];
                sum2=array[i+1][j+1];
                sum3=array[i+2][j]+array[i+2][j+1]+array[i+2][j+2];
                if ((sum1+sum2+sum3)>max)
                    max=sum1+sum2+sum3;
            }
        }
        System.out.println(max);
    }
}
