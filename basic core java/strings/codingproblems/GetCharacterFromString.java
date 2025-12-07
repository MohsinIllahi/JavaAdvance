package strings.codingproblems;

public class GetCharacterFromString
{

    public static void main(String[] args)
    {
        String name = "Mohsin";
        int index = 4;
        System.out.println("The character at index: " + index + " is " + name.charAt(index));
        // Itersrte over the string
        char[] charArray = name.toCharArray();
        for (char c : charArray)
        {
            System.out.println(c);
        }
        System.out.println("reverse of given String is: " + reverse(name));
    }

    public static String reverse(String name)
    {
        int length = name.length() - 1;
        String reverse = "";
        for (int i = length; i >= 0; i--)
        {
            reverse += name.charAt(i);
        }
        return reverse;
    }

}
