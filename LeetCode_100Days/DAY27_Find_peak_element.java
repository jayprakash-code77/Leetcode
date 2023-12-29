package Leetcode.LeetCode_100Days;

class Solution27 {
    public int findPeakElement(int[] nums) {
        // Check if the array has only one element
        if (nums.length == 1) {
            return 0; // Single element is a peak
        } else if (nums[0] > nums[1]) {
            return 0; // First element is a peak
        } else if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1; // Last element is a peak
        } else {
            // Binary search setup
            int start = 1;
            int end = nums.length - 2;

            // Binary search loop
            while (start <= end) {
                int mid = (start + end) / 2;

                // Check if mid is a peak
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                    return mid;
                } else if (nums[mid] < nums[mid + 1]) {
                    start = mid + 1; // Move search space to the right
                } else {
                    end = mid - 1; // Move search space to the left
                }
            }

            return -1; // No peak found
        }
    }
}

public class DAY27_Find_peak_element {
    public static void main(String[] args) {
        // Example
        Solution27 s = new Solution27();
        int arr[] = { 1, 2, 3, 1 };
        int result = s.findPeakElement(arr);
        System.out.println(result);

    }
}
