package Leetcode.LeetCode_100Days;
// Solution starts at line 3
class Solution2 {
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
// Solution ends at line 20

public class DAY2_Palindrome_number {
    public static void main(String[] args) {
        // example 
        Solution2 s=new Solution2(); // Instance of class
        boolean ans=s.isPalindrome(9); // Calling the "isPalindrome" function.
        System.out.println(ans);
        // Output:- true  (9 is a palindrome)
    }
}
 