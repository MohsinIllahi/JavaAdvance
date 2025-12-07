package strings.codingproblems;

public class StringToStringArray
{
    public static void main(String[] args)
    {
        String sentence = "Mohsin is java developer in teresol";
        String[] arrayOfString = sentence.split(" ");
        for (String words : arrayOfString)
        {
            System.out.println(words);
        }
    }
}
