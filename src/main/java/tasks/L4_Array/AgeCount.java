package tasks.L4_Array;

public class AgeCount {
    public static void main(String[] args) {
        int[] array = new int[10000000];
        for (int i = 0; i < array.length; i++) {
            int a = (int) (Math.random() * 150);
            array[i] = a;
        }
//        System.out.println(Arrays.toString(array));

        int[] amountOfNumber = new int[150];
        for (int i = 0; i < array.length; i++) {
            amountOfNumber[array[i]]++;
        }

        for (int i = 0; i < amountOfNumber.length; i++) {
            System.out.println(i + ": " + amountOfNumber[i]);
        }
    }
}
