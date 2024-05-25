class Solution {
    public int maxSumDivThree(int[] nums) {
        int n=nums.length;
        int[] sums=new int [3];

        for(int i=0; i<n; i++){
            int s0=sums[0]+nums[i];
            int s1=sums[1]+nums[i];
            int s2=sums[2]+nums[i];

            int r0=s0 % 3;
            int r1=s1 % 3;
            int r2=s2 % 3;

            sums[r0]=Math.max(sums[r0], s0);
            sums[r1]=Math.max(sums[r1], s1);
            sums[r2]=Math.max(sums[r2], s2);
        } 

        return sums[0];
    }
}
