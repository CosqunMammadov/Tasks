package tasks.L3_Loop;

public class RombPrint_1For {
    public static void main(String[] args) {
        int userInput = 7;
        int amountOfRows = userInput * 2 - 1;
        int amountOfColumn = userInput * 2 - 2;
        int a = userInput - 1;
        int b = userInput -1;




        int row = 0;
        for (int column = 0; column <= amountOfColumn; column++) {
            if (row == userInput) {
                row++;
                column = -1;
                continue;
            }


            if (row % 2 == 0 && column % 2 == 0 && column <= a && column >= b)
                System.out.print("*");
            else if (row % 2 != 0 && column % 2 != 0 && column <= a + 1 && column >= b - 1)
                System.out.print("*");
            else System.out.print(" ");


            if (column == amountOfColumn && row != amountOfRows +1) {
                System.out.println();

                if (row >= userInput + 1 && row % 2 == 0 ) {
                    a -= 2;
                    b += 2;
                } else if (row <= userInput - 1 && row % 2 != 0 ) {
                    a += 2;
                    b -= 2;
                }
                row++;
                column = -1;
            }

        }
        // 0123456789123
        //       *         0
        //      * *        1
        //     * * *       2
        //    * * * *      3
        //   * * * * *     4
        //  * * * * * *    5
        // * * * * * * *   6
        // 0123456789123
    }
}

