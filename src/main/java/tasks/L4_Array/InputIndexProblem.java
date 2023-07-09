package tasks.L4_Array;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class InputIndexProblem {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] array={1,2,3,4};
        while (true){
            int[] newArray= new int[array.length+1];
            System.out.println("Enter index and element");
            String userInput= scan.nextLine();
            if (Objects.equals(userInput, "exit"))
                break;

            int index=Integer.parseInt(String.valueOf(userInput.charAt(0)));
            int newElement=Integer.parseInt(String.valueOf(userInput.charAt(2)));


            for (int i = 0; i < newArray.length; i++) {
                if (i<index)
                    newArray[i]=array[i];
                else if (i==index) {
                    newArray[i] = newElement;
                }else
                        newArray[i]=array[i-1];

                }

            array=newArray;

            System.out.println(Arrays.toString(array));


            }
        }
    }
