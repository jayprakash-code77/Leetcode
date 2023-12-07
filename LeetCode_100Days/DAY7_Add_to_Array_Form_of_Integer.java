package Leetcode.LeetCode_100Days;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution7 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int p = num.length - 1;
        int carry = 0;

        while (p >= 0 || k > 0) {
            int numval = 0;
            if (p >= 0) {
                numval = num[p]; // valur of num array
            }

            int d = k % 10; // it is the last digit from k;

            int sum = numval + d + carry;

            int digit = sum % 10;
            carry = sum / 10;

            ans.add(digit);

            p--; // moving pointer to next element of array
            k = k / 10; // removing last digit of k
        }
        if (carry > 0) {
            ans.add(carry);
        }

        Collections.reverse(ans);
        return ans;

    }
}

public class DAY7_Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        // Example
        Solution7 s = new Solution7();
        int arr[] = { 1, 2, 0, 0 };
        List<Integer> result = s.addToArrayForm(arr, 34);
        // print integer list
        for (Integer number : result) {
            System.out.println(number);
        }

    }
}
