class Solution {
    public int sumOfUnique(int[] nums) {
        int[] frequency = new int[101];  // To count occurrences of each element
        int sum = 0;

        // Count frequency and calculate the sum of unique elements in a single loop
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            frequency[num]++;  // Increment the count for this number

            // Check if this number is unique or has become non-unique
            if (frequency[num] == 1) {
                sum += num;  // Add to sum when it appears for the first time
            } else if (frequency[num] == 2) {
                sum -= num;  // Remove from sum when it appears more than once
            }
        }

        return sum;
    }
}
