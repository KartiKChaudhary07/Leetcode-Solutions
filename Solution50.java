class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstValue = convertToNumber(firstWord);
        int secondValue = convertToNumber(secondWord);
        int targetValue = convertToNumber(targetWord);
        return firstValue + secondValue == targetValue;
    }
    
    public int convertToNumber(String word) {
        int num = 0;
        for (int i = 0; i < word.length(); i++) {
            num = num * 10 + (word.charAt(i) - 'a');
        }
        return num;
    }
}
