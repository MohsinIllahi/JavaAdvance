package strings;

public class StringProblemWordCount {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog. The quick brown fox is quick";
        String wordToCount = "quick";
        int count = countWords(wordToCount, input);
        System.out.println("The word '" + wordToCount + "' occurs " + count
                + " times.");

    }

    private static int countWords(String word, String sentence) {
        int count = 0;
        String[] sentenceArray = sentence.split("\\s+");
        for (String wordFind : sentenceArray) {
            System.out.println(wordFind);
            if (word.equalsIgnoreCase(wordFind)) {
                count++;
            }
        }
        System.out.println("-------"+count);
        return count;
    }
}
