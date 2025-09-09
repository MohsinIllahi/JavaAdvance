package controlstatements;

public class SwapNumbers {
    public static void main(String[] args) {
        // swap two integers
        int a = 10, b = 20, t;
        t = a;// 10
        a = b;// 20
        b = t;// 10
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println();
        // swap two numbers without using 3rd variable
        int x = 10, y = 20;
        x = x + y;// 30
        y = x - y;// 10
        x = x - y;// 20
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
