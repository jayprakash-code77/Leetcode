package Leetcode.LeetCode_100Days;
import java.util.ArrayList;

class Solution15 {
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else

            if (i % 3 == 0) {
                answer.add("Fizz");
            } else

            if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                // String str=String.valueOf(i);
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}

public class DAY15_Fizz_Buzz {
    public static void main(String[] args) {

        Solution15 s = new Solution15();
        System.out.println(s.fizzBuzz(3));

    }
}
