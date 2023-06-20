package tasks.tasks5Methods;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        findSmallestNumber();
    }



    public static void findSmallestNumber(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter quantity of number");
        int quantityNumber=scan.nextInt();

        int[] array= new int[quantityNumber];
        System.out.println("Enter your numbers");
        for (int i = 0; i < quantityNumber; i++) {
            array[i]=scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[0]);
    }
}
