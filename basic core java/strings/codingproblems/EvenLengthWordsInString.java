package strings.codingproblems;

public class EvenLengthWordsInString 
{

    public static void main(String[] args) 
    {
        String sentence = "This is simple thing tso get it done";
        evenWords(sentence);    
    }

    private static void evenWords(String sentence)
    {
        for (String word : sentence.split(" "))
        {
            if (word.length() % 2 == 0)
            {
                System.out.println(word);
            }
        }
    }
}
