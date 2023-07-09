package tasks.L2_If_Else;

import java.util.Scanner;

public class If_elseExercise {



        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int N = scanner.nextInt();

            scanner.close();
            if((N%2)!=0){
                System.out.println("Weird");
            } else if(2 < N && N < 5){
                System.out.println("Not Weird");
            }else if(6 < N && N < 20){
                System.out.println("Not Weird");
            }else {
                System.out.println("Not Weird");
            }
        }
    }

