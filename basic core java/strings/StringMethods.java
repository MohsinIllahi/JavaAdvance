package strings;
public class StringMethods {
    public static void main(String[] args) {
          String searchMe = "Green Eggs and Ham";
        String findMe = "Eggs";
        regionMatches(searchMe, findMe);
        
    }
    private static void regionMatches(String searchMe,String findMe){
        int lengthSearchMe=searchMe.length();
        int lengthFindMe=findMe.length();
        boolean found= false;
        checkRegion:
        for (int i = 0; (i <=lengthSearchMe-lengthFindMe); i++) {
            if (searchMe.regionMatches(i, findMe, 0, lengthFindMe)) {
                found=true;
                System.out.println(searchMe.substring(i, i+lengthFindMe));
                break checkRegion;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }

    }

}
