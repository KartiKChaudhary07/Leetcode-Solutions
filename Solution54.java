class Solution {
    public boolean detectCapitalUse(String word) {
        for(int i=0; i<word.length(); i++) {
            if(!Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
