package Leetcode.LeetCode_100Days;
import java.util.Arrays;

class Solution24 {
    // Main function to find the range of occurrences for the target element
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 }; // Initialize result array with default values

        // Check if the input array is empty
        if (nums.length == 0) {
            return ans;
        }

        // Find the first occurrence and last occurrence using binary search
        ans[0] = firstOccurrence(nums, target);
        ans[1] = lastOccurrence(nums, target);

        return ans;
    }

    // Binary search to find the index of the first occurrence of the target
    public int firstOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1; // Default value if target is not found

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                ans = mid; // Update answer and search for earlier occurrences
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    // Binary search to find the index of the last occurrence of the target
    public int lastOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1; // Default value if target is not found

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                ans = mid; // Update answer and search for later occurrences
                start = mid + 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}

public class DAY24_Find_first_and_last_position_of_element {

    public static void main(String[] args) {
        // Example
        Solution24 s = new Solution24();
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int result[] = s.searchRange(arr, target);
        System.out.println(Arrays.toString(result));

    }
}
