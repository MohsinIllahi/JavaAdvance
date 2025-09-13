package controlstatements;

public class Armstrong {
    public static void main(String[] args) {
        armstrongNumber(153);
    }

    static void armstrongNumber(int no) {
        int originalNumber = no;
        int temp = originalNumber;
        int power = 0;
        //find power
        while (temp != 0) {
            temp = temp / 10;
            power++;
        }
        //to perform sum 
        int temp2 = originalNumber;
        int sum = 0;
        while (temp2 != 0) {
            int lastDigit = temp2 % 10;
            sum = (int) (sum + Math.pow(lastDigit, power));
            temp2 = temp2 / 10;
        }
        //condition to check
        if (originalNumber == sum) {

            System.out.println(originalNumber + " Armstrong number");
        } else {
            System.out.println(originalNumber + " Not Armstrong number");

        }
    }

}
