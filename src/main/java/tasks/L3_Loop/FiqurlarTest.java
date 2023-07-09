package tasks.L3_Loop;

import java.util.Scanner;

public class FiqurlarTest {
    public static void main(String[] args) {
        Fiqurlar fiqurlar= new Fiqurlar();
        Scanner s= new Scanner(System.in);
        String istenilenFiqur= s.nextLine();
        if (istenilenFiqur.equals("kvadrat N2") ) {
            fiqurlar.kvadratN2(4,5);
        } else if (istenilenFiqur.equals("kvadrat N1")) {
            fiqurlar.kvadratN1(4,5);
        } else if (istenilenFiqur.equals("ucbucaq N1")) {
            fiqurlar.ucbucaqN1(6,6);
        } else if (istenilenFiqur.equals("ucbucaq N2")) {
            fiqurlar.ucbucaqN2(4,7);
        }
    }
}
