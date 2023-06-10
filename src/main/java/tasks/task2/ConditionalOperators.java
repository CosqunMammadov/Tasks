package tasks.task2;

import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);


        System.out.print("Input an alphabet: ");
        String userInput = scan.next();

        boolean uppercase = userInput.charAt(0) >= 65 && userInput.charAt(0) <= 90;
        boolean lowercase = userInput.charAt(0) >= 97 && userInput.charAt(0) <= 122;
        boolean vowels = userInput.equals("a") || userInput.equals("e") || userInput.equals("i")
                || userInput.equals("o") || userInput.equals("u");

        if (userInput.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }



//        int numericalMark= scan.nextInt();
//        String textMark="";
////        switch (numericalMark){
////            case 0:
////                textMark="Suspenso";
////                break;
////            case 1:
////                textMark="Suspenso";
////                break;
////            case 2:
////                textMark="Suspenso";
////                break;
////            case 3:
////                textMark="Suspenso";
////                break;
////            case 4:
////                textMark="Suspenso";
////                break;
////            case 5:
////                textMark="Aprobado";
////                break;
////            case 6:
////                textMark="Bien";
////                break;
////            case 7:
////                textMark="Notable";
////                break;
////            case 8:
////                textMark="Notable";
////                break;
////            case 9:
////                textMark="Sobresaliente";
////                break;
////            case 10:
////                textMark="Sobresaliente";
////                break;
////        }
//
//
//        if (numericalMark>=0 && numericalMark<=4) {
//            textMark = "Suspenso";
//        }else if (numericalMark==5) {
//            textMark="Aprobado";
//        } else if (numericalMark==6) {
//            textMark="Bien";
//        } else if (numericalMark==7||numericalMark==8) {
//            textMark="Notable";
//        } else if (numericalMark==9||numericalMark==10) {
//            textMark="Sobresaliente";
//        }
//
//
//        textMark= numericalMark>=0&&numericalMark<=4 ? "Suspenso": numericalMark==5?"Aprobado":numericalMark==6?"Bien":numericalMark>6&&numericalMark<9?"Notable":"Sobresaliente";
//        System.out.println(textMark);
    }
}
