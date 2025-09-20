

public class CharacterFindInString {
    public static void main(String[] args) {
         String searchMe = "peter piper picked a " + "peck of pickled peppers";
         int max = searchMe.length();
         int countP=0;

         for (int i = 0; i < max; i++) {
            if (searchMe.charAt(i)!='p') {
                continue;
            }
            countP++;
         }
         System.out.println("No: of P's in String : "+countP);

    }
}
