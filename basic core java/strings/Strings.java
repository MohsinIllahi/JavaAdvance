package strings;
public class Strings {
public static void main(String[] args) {
    char[] helloArray={'h','e','l','l','o','.'};
    String printString= new String(helloArray);
    System.out.println(printString);
    
      
        String name = "Sachin";
        String nameConcat = name.concat(" Tendulkar");
        System.out.println(name);
        System.out.println(nameConcat);

        String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + (s1 == s2));
        StringBuffer sBuffer = new StringBuffer(s1);
        System.out.println(s1.equals(sBuffer));
    
}
}