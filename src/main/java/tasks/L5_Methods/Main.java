package tasks.L5_Methods;

public class Main {
    static int result = sum(10);
    public static void main(String[] args) {
//        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            System.out.println(result);
            return k + sum(k - 1);   // 10+(9+(8+(7+(6+...))))...  məncə belə davam edir
        } else {
            return 0;
        }
    }

}
