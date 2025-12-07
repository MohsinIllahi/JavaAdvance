package strings.codingproblems;

public class CountWordsInSentence
{
    public static void main(String[] args)
    {
        String sentence="Hello my name is mohsin";
        System.out.println(CountWords(sentence));

    }
    
    private static int CountWords(String name)
    {
        int count = 0;
        for (String word : name.split(" "))
        {
            count++;
        }
        return count;
    }
}
