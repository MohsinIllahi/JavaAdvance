package strings.codingproblems;

public class InsertStringIntoString 
{
    public static void main(String[] args) 
    {
        /*Original String: GeeksGeeks
        String to be inserted: For
        String to be inserted at index: 4
        Modified String: GeeksForGeeks */
        // Get the Strings
        String originalString = "MohsinBhutto";
        String stringToBeInserted = " Illahi ";
        int index = 5;
        System.out.println("String to be inserted: "+stringToBeInserted);
        System.out.println("String to be inserted at index: "+index);
        System.out.println("Original String: "+originalString);
        System.out.println("Modified String: "+insertStringToString(originalString, stringToBeInserted,  index));

        

    }

    private static String insertStringToString(String originalString,String stringToBeInserted, int index) 
    {
        String newString= new String();
        for (int i = 0; i < originalString.length(); i++) 
        {
            newString+=originalString.charAt(i);
            if (i==index) 
            {
            newString+=stringToBeInserted;
            }
        }
       return newString;  
    }
}
