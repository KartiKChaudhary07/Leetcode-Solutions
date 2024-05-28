class Solution {
  public int equalSubstring(String s, String t, int maxCost) {
    int n = s.length();
    int count = 0;
    int currentCost = 0;
    int left = 0;

    for (int right = 0; right < n; right++) {
      currentCost += Math.abs(s.charAt(right) - t.charAt(right));

      while (currentCost > maxCost) {
        currentCost -= Math.abs(s.charAt(left) - t.charAt(left));
        left++;
      }

      count = Math.max(count, right - left + 1);
    }

    return count;
  }
}
