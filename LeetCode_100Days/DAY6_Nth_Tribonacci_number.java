package Leetcode.LeetCode_100Days;

class Solution6 {
    // This is the function to print the nth Tribonacci number.
    public int tribonacci(int n) {

        int t0=0;
        int t1=1;
        int t2=1;
        int sum=0;
        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }else{
            for(int i=3;i<=n;i++){
                sum=t0+t1+t2;
                t0=t1;
                t1=t2;
                t2=sum;
            }
            return sum;
        }
    }
}
public class DAY6_Nth_Tribonacci_number {
    public static void main(String[] args) {
        Solution6 s=new Solution6();
        int ans =s.tribonacci(25);
        System.out.println(ans);
    }
}
