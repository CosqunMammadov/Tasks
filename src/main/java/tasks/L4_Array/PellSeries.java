package tasks.L4_Array;

public class PellSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+ ", "+ b+ ", ");
        int userInput = 5741;

        while (b != userInput){
            int c = b;
            b = 2 * b + a;
            a = c;
            System.out.print(b+", ");
        }
    }
}
