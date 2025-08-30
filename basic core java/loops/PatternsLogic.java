package loops;

public class PatternsLogic {
/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    *  
     */

      static void pattern28(int n) {
        System.out.println("Pattern 28");
        for (int row = 1; row <= 2 * n; row++) {
            int columnsTotal = row > n ? 2 * n - row : row;
            int totalSpaceCount=n-columnsTotal;
            for (int s = 0; s < totalSpaceCount; s++) {
                System.out.print(" ");
                
            }
            // for every row run the column
            for (int column = 1; column <= columnsTotal; column++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();

        }
    }
    /*
     * 
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    static void pattern6(int n) {
        System.out.println("Pattern 6");
        for (int row = 1; row <= 2 * n; row++) {
            int columnsTotal = row > n ? 2 * n - row : row;
            // for every row run the column
            for (int column = 1; column <= columnsTotal; column++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();

        }
    }

    /*
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     */
    static void pattern5(int n) {
        System.out.println("Pattern 5");
        for (int row = 1; row <= 2 * n; row++) {
            int columnsTotal = row > n ? 2 * n - row : row;
            // for every row run the column
            for (int column = 1; column <= columnsTotal; column++) {
                System.out.print(column + " ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();

        }
    }

    /*
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     */
    static void pattern4(int n) {
        System.out.println("Pattern 4");
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();

        }
    }

    /*
     * * * *
     * * * *
     * * * *
     * * * *
     */
    static void pattern1(int n) {
        System.out.println("Pattern 1");
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int column = 1; column <= n; column++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();
        }

    }

    /*
     * 
     * *
     * * *
     * * * *
     */
    static void pattern2(int n) {
        System.out.println("Pattern 2");
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();

        }
    }

    /*
     * * * *
     * * *
     * *
     * 
     */
    static void pattern3(int n) {
        System.out.println("Pattern 3");
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            // for (int column = n; column >= row; column--) {
            for (int column = 1; column <= n - row; column++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();

        }
    }
/*
        1 
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 */
    static void pattern30(int n){
        //rows
        for (int rows = 1; rows <= n; rows++) {
            //space
            for (int space = 1; space <= n-rows; space++) {
                System.out.print("  ");
                
            }
            for(int noLeft=rows;noLeft>=1;noLeft--){
                System.out.print(noLeft+" ");
            }
            for(int noRight=2;noRight<=rows;noRight++){
                System.out.print(noRight+" ");
            }
            System.out.println();
        }
    }
/*
        1 
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4 
    3 2 1 2 3
      2 1 2
        1

 */
    static void pattern31(int n){
        //rows
        for (int rows = 1; rows <= 2*n; rows++) {
            int columnsTotal = rows > n ? 2 * n - rows : rows;
            int totalSpaceCount=n-columnsTotal;
            //space
            for (int space = 1; space <= totalSpaceCount; space++) {
                System.out.print("  ");
                
            }
            for(int noLeft=columnsTotal;noLeft>=1;noLeft--){
                System.out.print(noLeft+" ");
            }
            for(int noRight=2;noRight<=columnsTotal;noRight++){
                System.out.print(noRight+" ");
            }
            System.out.println();
        }
    }

}
