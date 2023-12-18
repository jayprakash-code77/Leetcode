package Leetcode.LeetCode_100Days;
public class DAY18_Largest_Number_At_Least_Twice_of_Others {

    // first Approach :->>> Solved using Bruteforce approach
    public static int dominantIndex(int[] nums) {
        // find largest
        int largest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nums[largest]) {
                largest = i;
            }
        }
        // compare
        for (int i = 0; i < nums.length; i++) {
            if (i == largest) {
                continue;
            }
            if (2 * nums[i] > nums[largest]) {
                return -1;
            }
        }
        return largest;
    }

    // Second Approach :->>> Example one itration approach :-
    public static int dominantIndex_2ndApproach(int array[]) {
        int max = -1;
        int max2 = -1;
        int idx = 0;
        // for loop
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max2 = max;
                max = array[i];
                idx = i;
            }
        }
        // final comparision
        if (2 * max2 > max) {
            return -1;
        }
        return idx;
    }

    public static void main(String[] args) {
        // first Approach :->>> Example (BruteForce)
        /*
         * int arr[] = { 3,6,1,0 };
         * int result = dominantIndex(arr);
         * System.out.println(result);
         */

        // Second Approach :->>> Example one itration approach :-
        int arr[] = { 1, 2, 3, 4 };
        int ans = dominantIndex_2ndApproach(arr);
        System.out.println(ans);

    }
}
