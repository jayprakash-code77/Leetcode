package Leetcode.LeetCode_100Days;
class Solution17 {
    public int bulbSwitch(int n) {
        int count = 0;
        int i = 1;
        while (i * i <= n) {
            count++;
            i++;
        }
        return count;
    }
}

public class DAY17_Bulb_Switcher {
    public static void main(String[] args) {
        // Example
        Solution17 s = new Solution17();
        int k = 15;
        int ans = s.bulbSwitch(k);
        System.out.println(ans);

    }

}
