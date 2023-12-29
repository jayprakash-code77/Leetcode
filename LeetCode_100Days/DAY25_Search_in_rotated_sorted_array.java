package Leetcode.LeetCode_100Days;
class Solution25 {
    public int search(int[] nums, int target) {
        // Initialize pointers for binary search
        int start = 0;
        int end = nums.length - 1;

        // Perform binary search
        while (start <= end) {
            // Calculate midpoint
            int mid = (start + end) / 2;

            // Check if midpoint is the target
            if (nums[mid] == target) {
                return mid; // Target found, return the index
            } else if (nums[start] <= nums[mid]) { // First part is sorted
                // Check if target is in the sorted part, adjust pointers
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Second part is sorted
                // Check if target is in the sorted part, adjust pointers
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        // Target not found in the array
        return -1;
    }
}

public class DAY25_Search_in_rotated_sorted_array {
    public static void main(String[] args) {
        // Example
        Solution25 s = new Solution25();
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int result = s.search(arr, 0);
        System.out.println(result);
    }
}
