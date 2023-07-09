package tasks.L4_Array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] givenArray={4,3,2,2,5,7,2,5};
        int[] testArray=new int[givenArray.length];
        for (int i = 0; i < givenArray.length; i++) {
            boolean test=true;
            for (int a:testArray){
                if (a == givenArray[i]) {
                    test = false;
                    break;
                }
            }
            if (test)
                testArray[i]=givenArray[i];
        }
        System.out.println(Arrays.toString(testArray));
        int count=0;
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i]!=0)
                count++;
        }
        System.out.println(count);
        int zeroAmount=0;
        int[] copiedArray= new int[count];
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] != 0)
                copiedArray[i-zeroAmount] = testArray[i];
            else zeroAmount++;

        }
        System.out.println(Arrays.toString(copiedArray));
    }
}
