class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder st = new StringBuilder(str);
        return str.equals(st.reverse().toString());
    }
}
