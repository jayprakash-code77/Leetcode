package Leetcode.LeetCode_100Days;

class Solution12 {
    public int[] sortedSquares(int[] nums) {
        // This will store the result of "shortedSquares" function
        int result[] = new int[nums.length];

        int start = 0; // start pointer for nums array
        int end = nums.length - 1; // end pointer for nums array
        // pointer for result array
        int pointer = result.length - 1;

        while (start <= end) {

            int squareStart = nums[start] * nums[start];
            int squareEnd = nums[end] * nums[end];

            if (squareStart > squareEnd) {
                result[pointer] = squareStart;
                start++;
            } else {
                result[pointer] = squareEnd;
                end--;
            }
            pointer--;
        }
        return result;
    }
}

public class DAT12_squares_of_a_sorted_array {

    public static void printArray(int arr[]) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }

    }

    public static void main(String[] args) {
        Solution12 s = new Solution12();
        int arr[] = { -4, -1, 0, 3, 10 };
        int ans[] = s.sortedSquares(arr);
        printArray(ans);
    }

}
