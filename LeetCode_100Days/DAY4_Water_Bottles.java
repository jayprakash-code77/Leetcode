package Leetcode.LeetCode_100Days;
class Solution4{
    public int numWaterBottles(int numBottles, int numExchange){
        // This will store the "numBottles" value
        int sum=numBottles;
        // This will calculate the number of water bottles that we can drink.
        for(int i=0;i<=numBottles/numExchange;i++){
            // This will update the value of sum by adding the number of water bottles that we can get by exchaning the empty bottles.
            sum=sum+(numBottles/numExchange);
            // This will update the value of "numBottles" by adding the value of (numBottles/numExchange) and (numBottles%numExchange).
            numBottles=(numBottles/numExchange)+(numBottles%numExchange);
            // If the number of bottles are less than the number of bottles that we need to get one filled water bottle than we will break and move out of the loop.
            if(numBottles<numExchange){
                break;
            }
        }
        // This will return the number of water bottles that we can drink.
        return sum;
    }
}
public class DAY4_Water_Bottles {

    public static void main(String[] args) {
        // Example
        Solution4 s=new Solution4();
        int ans = s.numWaterBottles(9, 3);
        System.out.println(ans);
    }

}
