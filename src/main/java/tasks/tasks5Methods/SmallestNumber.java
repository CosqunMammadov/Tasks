package tasks.tasks5Methods;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter quantity of number");
        int quantityNumber=scan.nextInt();
        int[] userNumbers= new int[quantityNumber];
        for (int i = 0; i < quantityNumber; i++) {
            userNumbers[i]=scan.nextInt();
        }
        System.out.println(findSmallestNumber(userNumbers));
    }



    public static int findSmallestNumber(int[] array){

        Arrays.sort(array);
        return array[0];
    }
}
