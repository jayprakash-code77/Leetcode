package Leetcode.LeetCode_100Days;
class Solution8 {
    public int maxProduct(int[] nums) {
        int max = -1;
        int smax = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }
        return (max - 1) * (smax - 1);
    }
}

public class DAY8_Maximum_Product_of_Two_Element_in_an_Array {
    public static void main(String[] args) {
        // Example
        Solution8 s = new Solution8();
        int arr[] = { 3, 4, 5, 2 };
        System.out.println(s.maxProduct(arr));
    }
}
