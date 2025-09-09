package controlstatements;

public class FindGreaterNumber {
    public static void main(String[] args) {
        char ch=0xFace;
        //question marks sign
        System.out.println(ch);
        // This program will check number greater than 3 given numbers
        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("a is reater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("C is greater");
        }
System.out.println();
System.out.println("2nd method");
        // 2nd method to solve that problem
if (a > b) {
    if (a > c) {
        System.out.println("a is greater");
    } else {
        System.out.println("C is greater");
    }
} else if (b > c) {
    System.out.println("b is greater");
} else {
    System.out.println("c is greater");
}
}
}
