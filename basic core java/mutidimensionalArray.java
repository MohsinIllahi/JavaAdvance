public class mutidimensionalArray {

    public static void main(String[] args) {
        int[][] arrayOfInts = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };

        int i;
        int j = 0;
        boolean found = false;
        int searchFor = 102;
        search: for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchFor) {
                    found = true;
                    break search;
                }

            }
        }
        if (found) {
            System.out.println("No: " + searchFor + " is found in array index: " + i + " , " + j);
        } else {
            System.out.println("No: " + searchFor + " is not present in array");
        }

    }

}
