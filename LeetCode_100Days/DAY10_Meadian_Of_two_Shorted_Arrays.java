package Leetcode.LeetCode_100Days;


class Solution10 {
    // function to merge to shorted arrays
    public static int[] mergeArray(int arr1[], int arr2[]) {
        int result[] = new int[arr1.length + arr2.length];

        int p1 = 0; // pointer 1
        int p2 = 0; // pointer 2
        int idxR = 0; // pointer of result array

        int v1 = 0; // initializing value v1
        int v2 = 0; // initializing value v2

        // Operations
        while (p1 < arr1.length || p2 < arr2.length) {
            // finding value of v1
            if (p1 < arr1.length) {
                v1 = arr1[p1];
            } else {
                v1 = Integer.MAX_VALUE;
            }
            // finding value of v2
            if (p2 < arr2.length) {
                v2 = arr2[p2];
            } else {
                v2 = Integer.MAX_VALUE;
            }
            // Comparing values v1 and v2
            if (v1 < v2) {
                result[idxR] = v1;
                p1++;
            } else {
                result[idxR] = v2;
                p2++;
            }
            // increamenting the value of idxR by one.
            idxR++;
        }
        // returning the result array
        return result;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int ans[] = mergeArray(nums1, nums2); // merging a1 and a2 arrays
        double solution = 0;
        if (ans.length % 2 == 0) { // if length of array is even
            solution = (double) (ans[ans.length / 2] + ans[ans.length / 2 - 1]) / 2;
        } else { // if length of array is odd
            solution = ans[ans.length / 2];
        }
        // returning the Median of two shorted arrays.
        return solution;

    }
}

public class DAY10_Meadian_Of_two_Shorted_Arrays {
    public static void main(String[] args) {
        Solution10 s = new Solution10();
        int arr1[] = { 1, 3 };
        int arr2[] = { 2 };
        double ans = s.findMedianSortedArrays(arr1, arr2);
        System.out.println(ans);
    }
}
