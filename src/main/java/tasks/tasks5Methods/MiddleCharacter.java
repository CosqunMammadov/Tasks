package tasks.tasks5Methods;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String userInput= scan.nextLine();
//        findMiddleCharacter(userInput);
//        countVowels(userInput);
        printPentagonalNumbers();

    }

    public static void findMiddleCharacter(String userInput){

        if (userInput.length()%2==0)
            System.out.println(userInput.charAt(userInput.length()/2)+" and "+userInput.charAt(userInput.length()/2-1));
        else System.out.println(userInput.charAt(userInput.length()/2));
    }

    public static void countVowels(String userInput){
        int count=0;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i)=='a'||userInput.charAt(i)=='e'||userInput.charAt(i)=='i'||userInput.charAt(i)=='o'||
            userInput.charAt(i)=='u')
                count++;
        }
        System.out.println(count);
    }

    public static void printPentagonalNumbers(){
        int a1=1;
        int a2=5;
        System.out.println(a1);
        System.out.println(a2);
        int count=2;
        while (count<=50){
            int c=a2;
            a2=(a2-a1)+3+a2;
            a1=c;
            System.out.println(a2);
            count++;
        }
    }
}
