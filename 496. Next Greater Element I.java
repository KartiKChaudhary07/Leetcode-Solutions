class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int current = nums1[i];
            boolean found = false;
            int nextGreater = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == current) {
                    found = true; 
                }    
                if (found && nums2[j] > current) {
                    nextGreater = nums2[j];
                    break; 
                }
            }

            arr[i] = nextGreater;
        }

        return arr;
    }
}
