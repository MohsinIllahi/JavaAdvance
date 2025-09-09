package controlstatements;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String yesNo;
            do {
                System.out.println("Enter 1st number:");
                int no1 = sc.nextInt();
                System.out.println("Enter 2nd number :");
                int no2 = sc.nextInt();
                System.out.println("Enter operation symbol(+,-,*,/)");
                char symbol = sc.next().charAt(0);
                int result;

                switch (symbol) {
                    case '+':
                        result = no1 + no2;
                        System.out.println("Result of " + no1 + symbol + no2 + " is equal to " + result);
                        break;
                    case '-':
                        result = no1 - no2;
                        System.out.println("Result of " + no1 + symbol + no2 + " is equal to " + result);
                        break;
                    case '*':
                        result = no1 * no2;
                        System.out.println("Result of " + no1 + symbol + no2 + " is equal to " + result);

                        break;
                    case '/':
                        result = no1 / no2;
                        System.out.println("Result of " + no1 + symbol + no2 + " is equal to " + result);

                        break;
                    default:
                        System.out.println("Unidentified symbol is given.");
                        break;
                }
                System.out.println("Do you want to continue : Y/N");
                yesNo = sc.next();
            } while ("Y".equals(yesNo) || "y".equals(yesNo));
        }
    }

}
