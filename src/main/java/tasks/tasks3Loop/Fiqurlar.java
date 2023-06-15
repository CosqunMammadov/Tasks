package tasks.tasks3Loop;

public class Fiqurlar {
    public void kvadratN2(int row, int column){    //ici bos kvadrat
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                if (i==0 | i== row-1){
                    System.out.print("*");
                }else{
                    if (j==0 | j== column-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void kvadratN1(int row, int column){    //ici dolu kvadrat
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void ucbucaqN2(int row, int column){          //ucbucaq
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                if (i== row-1 || j==column/2)
                    System.out.print("*");
                else if (i==1 && j==2 | j==4 ) {
                    System.out.print("*");
                } else if (i==2 && j>0 & j<column-1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void ucbucaqN1(int row, int column){   //duzbucaqli ucbucaq
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                if (i== row-1)
                    System.out.print("*");
                else if (i==0 & j==0) {
                    System.out.print("*");
                } else if (i==1 & j<2) {
                    System.out.print("*");
                } else if (i==2 & j<3) {
                    System.out.print("*");
                } else if (i==3 & j<4) {
                    System.out.print("*");
                } else if (i==4 & j<5 ) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
