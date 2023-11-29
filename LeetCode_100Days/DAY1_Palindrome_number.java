package Leetcode.LeetCode_100Days;

// This is a start of Solution
class Solution {
    public boolean isPalindrome(int x) {
        int ori_num=x;
        int rev=0;
        while(x!=0){
            rev=rev*10 + x%10;
            x=x/10;
        }

        if(ori_num<0){
            return false;
        }else if(ori_num == rev){
            return true;
        }else{
            return false;
        }
    }
}
// This is the end of Solution

public class DAY1_Palindrome_number {
    public static void main(String[] args) {
        Solution s=new Solution(); // Instance of class
        boolean ans=s.isPalindrome(9); // Calling the "isPalindrome" function.
        System.out.println(ans);
        // Output:- true  (9 is a palindrome)
    }
}
