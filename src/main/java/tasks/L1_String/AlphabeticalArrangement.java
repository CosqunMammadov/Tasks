package tasks.L1_String;

import java.util.Arrays;

public class AlphabeticalArrangement {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] arrayStr = str.split(" ");

        for (int i = 0; i < arrayStr.length; i++) {
            String[] chars = arrayStr[i].split("");
            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < chars.length; k++) {
                    if (chars[j].compareToIgnoreCase(chars[k])<0){
                        String a =  chars[j];
                        chars[j] = chars[k];
                        chars[k] = a;
                    }
                }
            }
           arrayStr[i] = Arrays.toString(chars);
            for (String s : chars)
                System.out.print(s);
            System.out.print(" ");
        }

    }
}
