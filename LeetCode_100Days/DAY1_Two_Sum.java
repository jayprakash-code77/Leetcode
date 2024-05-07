package Leetcode.LeetCode_100Days;
// solution started from line 2


class Solution {
    public int[] twoSum(int[] nums, int target) {
        // initializing the "arr" to store the result that has to be returned
        int[] arr = new int[2];
        // performing operations
        for (int i = 0; i < nums.length; i++) { // this loop will run n-1 times (where 'n' is the length of array )
                                                // starting from 0.

            for (int j = i + 1; j < nums.length; j++) { // this loop will run n-1 times (where 'n' is the length of
                                                        // array ) starting from 'i'.

                if (nums[i] + nums[j] == target) {
                    arr[0] = i; // store index of first number
                    arr[1] = j; // store index of seconf number
                    break;
                }

            }
        }
        // return "arr" which contains index of two number in the array ans the sum of
        // both number equals to "target"
        return arr;
    }
}
// solutions ends on line 20

public class DAY1_Two_Sum {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // making object
        Solution s = new Solution();

        int arr[] = { 2, 7, 11, 15 }; // passing an example array
        int target = 9; // example target
        // storing result array in "arr1"
        int arr1[] = s.twoSum(arr, target);
        // printing "arr1" array
        printArray(arr1);
        System.out.println("I am the end of this program.");
    }
}
