package strings.codingproblems;

public class ComparisonThroughLexicographically
{
    public static void main(String[] args)
    {
        String s1 = "Mohsin";
        String s2 = "Mohsin";
        System.out.println("Both are equal lexicographically: "+comapre(s1, s2));

    }

    public static boolean comapre(String s1, String s2)
    {
        if (s1.compareTo(s2) == 0)
        {
            return true;
        }
        return false;
    }
}
