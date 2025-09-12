package controlstatements;

public class Pallindrome {
    public static void main(String[] args) {
        /*
        reverse the name then both the original and reverse number
        should be equal that is pallindrome number
        */
        int original = 12;
        int temp = original;
        int reverse = 0;
        while (temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }
        if (reverse == original) {
            System.out.println(reverse + " Palindrome " + original);
        } else {
            System.out.println(reverse + " Not Palindrome " + original);

        }

    }

}
