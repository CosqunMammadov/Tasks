package tasks.task2;

import java.util.Scanner;

public class If_elseExercise {



        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int N = scanner.nextInt();

            scanner.close();
            if((N%2)!=0){
                System.out.println("Weird");
            } else if((N%2)==0 && (2<N&&N<5)){
                System.out.println("Not Weird");
            }else if((N%2)==0 && (6<N&&N<20)){
                System.out.println("Not Weird");
            }else {
                System.out.println("Not Weird");
            }
        }
    }

