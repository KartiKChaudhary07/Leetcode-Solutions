class Solution {
    public int smallestEqual(int[] nums) {
        int ans = 0;
        int temp = 0;
        int n = 0;
        for(int i=0; i<nums.length; i++){
            if(i%10 == nums[i]){
                temp = i;

                if(n == 0){
                    ans = i;
                    n++;
                }
                
                if(ans > temp){
                    ans = temp;
                }

            }
        }
        if(n != 0){
            return ans;
        }
        return -1;
    }
}
