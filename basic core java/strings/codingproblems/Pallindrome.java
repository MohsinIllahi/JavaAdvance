package strings.codingproblems;

public class Pallindrome
{
    // when string and its reversed are both equal like wow=wow
    public static void main(String[] args)
    {
        String name = "WO";
        String reverse = "";
        int length = name.length() - 1;
        for (int i = length; i >= 0; i--)
        {
            reverse += name.charAt(i);
        }
        if (name.equals(reverse))
        {
            System.out.println("Palindrome");
        } else
        {
            System.out.println("Not Palindrome.");
        }
    }
}
