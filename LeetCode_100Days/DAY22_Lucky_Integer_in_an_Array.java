package Leetcode.LeetCode_100Days;
import java.util.*;

class Solution22 {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];

            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }

        int ans = -1;
        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}

public class DAY22_Lucky_Integer_in_an_Array {
    public static void main(String[] args) {
        Solution22 s = new Solution22();
        int arr[] = { 0, 3, 4, 5, 6, 0 };
        System.out.println(s.findLucky(arr));
    }
}
