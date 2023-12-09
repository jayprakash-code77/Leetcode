package Leetcode.LeetCode_100Days;
class Solution9 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int n = nums.length;
        return ((n * (n + 1)) / 2) - sum;
    }
}

public class DAY9_Missing_Number {
    public static void main(String[] args) {
        // Example
        Solution9 s = new Solution9();
        int[] arr = { 3, 0, 1 };
        int ans = s.missingNumber(arr);
        System.out.println(ans);

    }
}
