package strings;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Sis";
        String reversename = "";
        int length = name.length() - 1;
        for (int i = length; i >= 0; i--) {
            reversename += name.charAt(i);
        }
        System.out.println("name: " + name);
        System.out.println("reverse name:" + reversename);
        if (name.equals(reversename)) {
            System.out.println("palindrome.");
        } else {
            System.out.println("Not palindrome.");

        }
    }
}
