class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        int sum = 0;
        remainderIndexMap.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) sum %= k;
            if (remainderIndexMap.containsKey(sum)) {
                if (i - remainderIndexMap.get(sum) > 1)
                    return true;
            } else { 
                remainderIndexMap.put(sum, i);
            }
        }
        return false;
    }
}
