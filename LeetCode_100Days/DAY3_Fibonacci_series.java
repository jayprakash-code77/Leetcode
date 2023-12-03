package Leetcode.LeetCode_100Days;
class Solution3 {
    // function that calculates fibonacci nth fibonacci number
    public int fib(int n) {
        int N1=1;
        int N2=2;
        int check1=1;
        int check2=1;
        int sum=0;

        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }else{
            for(int i=3;i<=n;i++){
                sum=check1+check2;
                check1=check2;
                check2=sum;
            }
        }
        return sum;
    }
}

public class DAY3_Fibonacci_series {
    public static void main(String[] args) {
        // Example 
        Solution3 s= new Solution3(); // Instance of the class "Solution3";
        int n=3;
        // Calling "fib function"
        System.out.println(s.fib(6));

    }
}
