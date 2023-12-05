package Leetcode.LeetCode_100Days;
class Solution5{
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }else if(n==1){
            return true;
        }else{
            while(n%2==0){
                n=n/2;
            }
            if(n==1){
                return true;
            }else{
                return false;
            }
        }
    }
}
class Power_Of_Two{
    public static void main(String[] args) {
        Solution5 s=new Solution5();
        System.out.print(s.isPowerOfTwo(4));
    }
}