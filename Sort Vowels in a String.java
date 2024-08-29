import java.util.*;

class Solution {
    public String sortVowels(String s) {
        char[] chars = s.toCharArray();
        List<Character> vowels = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if ("aeiouAEIOU".indexOf(chars[i]) != -1) {
                vowels.add(chars[i]);
            }
        }

        Collections.sort(vowels);

        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if ("aeiouAEIOU".indexOf(chars[i]) != -1) {
                chars[i] = vowels.get(index);
                index++;
            }
        }

        return new String(chars);
    }
}
