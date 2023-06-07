package tasks.task1;

import java.util.Scanner;

public class Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.isEmpty()){
            System.out.println("0");
        }else {
            String[] splitted = s.split("[ !,?._'@]+");
            System.out.println(splitted.length);
            for (String outputString : splitted)
                System.out.println(outputString);
            scan.close();
        }
    }
}
