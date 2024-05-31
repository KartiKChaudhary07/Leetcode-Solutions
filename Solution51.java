import java.util.Arrays;

class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[2]; 
        int index = 0; 
        int i = 0;
        
        while (i < nums.length) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                arr[index++] = nums[i];
                i++;
            } else {
                i += 2; 
            }
        }
        
        return arr;
    }
}
