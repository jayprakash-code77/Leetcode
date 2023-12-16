package Leetcode.LeetCode_100Days;

class Solution16 {
    public int[] productExceptSelf(int[] nums) {

        //  right
        int right[] = new int[nums.length];
        int p = 1;
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            p = p * nums[i];
            right[i] = p;
        }

        int ans[] = new int[n];
        int left = 1;

        for (int i = 0; i < n - 1; i++) {
            int val = left * right[i + 1];
            ans[i] = val;
            left = left * nums[i];
        }
        ans[n - 1] = left;

        return ans;
    }
}

public class DAY16_Product_Of_Array_Except_self {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        Solution16 s = new Solution16();
        int[] nums = { 1, 2, 3, 4 };

        int result[] = s.productExceptSelf(nums);
        printArray(result);

    }
}
