package tasks.task1String;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Çətinlik dərəcəsini yazın 10, 100 və 1000");
        int levelOfDifficulty=scan.nextInt();
        int randomNum = (int)(Math.random() * levelOfDifficulty);
        // System.out.println(randomNum);
        System.out.println("Rəqəm təxmin edin");
        int writtenNumber=-1;
        while (randomNum!=writtenNumber){
            writtenNumber=scan.nextInt();
            if (writtenNumber-randomNum>10 && writtenNumber-randomNum<100){
                System.out.println("Çox böyükdür");
            } else if (writtenNumber - randomNum < -10 && writtenNumber-randomNum>-100) {
                System.out.println("Çox kiçikdir");
            } else if (writtenNumber - randomNum > -10 && writtenNumber-randomNum<0) {
                System.out.println("Kiçikdir");
            } else if (writtenNumber - randomNum >10 && writtenNumber-randomNum<0) {
                System.out.println("Böyükdür");
            }else if (writtenNumber - randomNum < -100) {
                System.out.println("Çox çox kiçikdir");
            }else if (writtenNumber - randomNum >100) {
                System.out.println("Çox çox böyükdür");
            }else {
                System.out.println("Təbriklər");
                break;
            }
        }
    }
}
