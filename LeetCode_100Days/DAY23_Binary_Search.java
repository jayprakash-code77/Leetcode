package Leetcode.LeetCode_100Days;
class Solution23 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int mid = (start + end) / 2;

        while (start <= end) {
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            mid = (start + end) / 2;
        }
        return -1;
    }
}

public class DAY23_Binary_Search {
    public static void main(String[] args) {
        // Example
        Solution23 s = new Solution23();

        int nums[] = { 2, 4, 7, 57, 98, 253 };
        int target = 98;

        int result = s.search(nums, target);
        System.out.println(result);

    }
}
