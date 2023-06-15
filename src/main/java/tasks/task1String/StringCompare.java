package tasks.task1String;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class StringCompare {

    @org.jetbrains.annotations.NotNull
    public static String getSmallestAndLargest(@NotNull String s, int k) {
        String smallest = "";
        String largest = "";
        String[] subString = new String[s.length()-(k-1)];

        for(int i=0; i<subString.length;i++)
            subString[i]=s.substring(i,i+k);

        smallest = subString[0];
        largest = subString[0];
        for(int i=1;i<subString.length;i++)
            if(largest.compareTo(subString[i])<0)
                largest=subString[i];
            else if(smallest.compareTo(subString[i])>0)
                smallest=subString[i];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
