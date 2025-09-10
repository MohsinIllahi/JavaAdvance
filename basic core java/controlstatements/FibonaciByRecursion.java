package controlstatements;

public class FibonaciByRecursion {
    static int a = 0, b = 1, c;

    public static void main(String[] args) {
        System.out.print(a + " " + b);
        FibonaciByRecursion fbRec = new FibonaciByRecursion();
        fbRec.printFb(10);

    }

    void printFb(int n) {
        if (n >= 1) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            //calling itself by reducing value by 1
            printFb(n - 1);
        }
    }
}
