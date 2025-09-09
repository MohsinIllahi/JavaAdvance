package controlstatements;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter name:");
        String name=scanner.nextLine();

        System.out.println("Enter Gender: ");
        char gender=scanner.next().charAt(0);

        System.out.println("Enter Age: ");
        int age=scanner.nextInt();

        System.out.println("Enter Phone no: ");
        long phone=scanner.nextLong();

        System.out.println("Hello, "+name);
        System.out.println("you are "+age+" years old.");
        System.out.println("your Gender is "+('M'== gender ?"Male":"Female"));
        System.out.println("your phone number is "+phone);
    }


}
}
