import java.util.Arrays;

public class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles); 
        int n = piles.length;
        int count = 0;
        int i = n - 2;
        int res = 0;
        while (count != n / 3) {
            res += piles[i]; 
            i -= 2; 
            count++; 
        }

        return res;
    }
}
