class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] map = new int[n + 1];
        map[0] = 1;
        int count = 0;
        int ans = 0;
        
        for (int j = 0; j < n; j++) {
            if (nums[j] % 2 == 1)
                count++;
            
            int diff = count - k;
            
            if (diff >= 0)
                ans += map[diff];
            
            map[count]++;
        }
        
        return ans;
    }
}
