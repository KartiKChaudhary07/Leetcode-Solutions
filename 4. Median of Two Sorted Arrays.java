class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        java.util.Arrays.sort(nums);
        
        int mid = nums.length / 2;
        return nums.length % 2 == 0 ? (nums[mid - 1] + nums[mid]) / 2.0 : nums[mid];
    }
}
