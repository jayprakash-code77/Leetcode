package Leetcode.LeetCode_100Days;
class Solution13 {
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0; // Initialize the start pointer to the beginning of the array
        int end = numbers.length - 1; // Initialize the end pointer to the end of the array

        while (start < end) { // Continue the loop until the start pointer is less than the end pointer
            int sum = numbers[start] + numbers[end]; // Calculate the sum of elements at start and end pointers

            if (sum == target) {
                // If the sum equals the target, return the indices (1-based) of the two numbers
                return new int[] { start + 1, end + 1 };
            } else if (sum > target) {
                // If the sum is greater than the target, decrement the end pointer to reduce
                // the sum
                end--;
            } else {
                // If the sum is less than the target, increment the start pointer to increase
                // the sum
                start++;
            }
        }

        // If no such pair is found, return an empty array
        return new int[] {};
    }
}

public class DAY13_Two_sum_ii_input_array_is_sorted {

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Example
        int arr[] = { 2, 7, 11, 15 };
        int result[] = Solution13.twoSum(arr, 9);
        printArray(result);

    }
}
