class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (hm.containsKey(c)) {
            hm.put(c, hm.get(c) + 1);
        } else {
            hm.put(c, 1);
        }
    }

    int ans = 0;
    boolean isFirstOdd = false;

    for (Character key : hm.keySet()) {
        if (hm.get(key) % 2 == 0) {
            ans += hm.get(key);
        } else {
            ans += hm.get(key);
            if (!isFirstOdd) {
                isFirstOdd = true;
            } else {
                ans -= 1;
            }
        }
    }

    return ans;
    }
}
