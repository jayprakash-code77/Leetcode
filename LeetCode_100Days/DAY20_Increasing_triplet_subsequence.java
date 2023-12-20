package Leetcode.LeetCode_100Days;
class Solution20 {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE; // Initialize first value
        int second = Integer.MAX_VALUE; // Initialize second value
        for (int third : nums) {
            if (first >= third) {
                first = third;
            } else if (second >= third) {
                second = third;
            } else {
                return true;
            }
        }
        return false;
    }
}

public class DAY20_Increasing_triplet_subsequence {
    public static void main(String[] args) {
        // Example
        Solution20 s = new Solution20();
        int nums[] = { 1, 2, 3, 4, 5 };
        boolean ans = s.increasingTriplet(nums);
        System.out.println(ans);
    }
}
