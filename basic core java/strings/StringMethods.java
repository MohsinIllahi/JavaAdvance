package strings;
public class StringMethods {
    public static void main(String[] args) {
        //concat,join,replace,replaceFirst,replaceAll,equals,length,compareTo,subString,subSequence
    String s1= "Mohsin";
    String s2= "illahi";
    System.out.println(s1.concat(" "+s2));// this will convcat both strings 
    System.out.println(String.join(" ", s1,s2));
    // System.out.println(s1.join(0)); 
        
        
        String searchMe = "Green Eggs and Ham";
        String findMe = "Eggs";
        //regionMatches(searchMe, findMe);
        
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
