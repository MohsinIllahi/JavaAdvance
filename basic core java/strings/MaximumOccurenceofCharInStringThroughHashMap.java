package strings;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurenceofCharInStringThroughHashMap {
    public static void main(String[] args) {
        String s = "this is democlass";
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] c = s.toCharArray();
        for (char ch : c) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.putIfAbsent(ch, 1);
            }
        }
        Integer maxCount = 0;
        char maxChar = ' ';
        for (Map.Entry mE : hm.entrySet()) {
            if (maxCount < (Integer) mE.getValue()) {
                maxCount = (Integer) mE.getValue();
                maxChar=(Character)mE.getKey();
            }
        }
        System.out.println("Maximum character is "+maxChar+" is "+maxCount+" times.");
    }
}
