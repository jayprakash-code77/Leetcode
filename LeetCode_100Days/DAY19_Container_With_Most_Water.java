package Leetcode.LeetCode_100Days;
class Solution19 {

    public int maxArea(int[] height) {

        int start = 0;
        int end = height.length - 1;
        int maxCap = 0;

        while (start < end) {
            int minH = Math.min(height[start], height[end]);
            int width = end - start;

            int currCapacity = minH * width;

            maxCap = Math.max(maxCap, currCapacity);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxCap;
    }

}

public class DAY19_Container_With_Most_Water {
    public static void main(String[] args) {
        // Example
        Solution19 s = new Solution19();
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int ans = s.maxArea(arr);
        System.out.println(ans);

    }
}
