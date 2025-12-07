package strings.codingproblems;

public class CompareTwoStrings
{
    public static void main(String[] args)
    {
        String s1 = "Mohsin";
        String s2 = "Mohsinsss";
        System.out.println("Both strings are equal: " + compareString(s1, s2));
    }

    public static boolean compareString(String s1, String s2)
    {
        if (s1.length() != s2.length())
        {
            System.out.println("");
            return false;
        }
        for (int i = 0; i < s1.length(); i++)
        {
            if (s1.charAt(i) != s2.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}
