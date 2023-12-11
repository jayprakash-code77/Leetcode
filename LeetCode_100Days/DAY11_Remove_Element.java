class Solution11{
    public static int  removeEle(int[] nums, int val){
        int ans=0; // this will count values not equal to "val".

        int i=0; // pointer 1
        int j=0; // pointer 2
        // performing operations
        while (j<nums.length) {
            if (val==nums[j]) {
                nums[j]=0;
                j++;
            }else{
                nums[i]=nums[j];
                i++;
                j++;
                ans++;
            }
        }
        // returning the ans
        return ans;
    }

    public int removeElement(int[] nums, int val){
        // calling "removeEle" function to print k(where k is number of element not equal to "val")
        return removeEle(nums, val);
    }
}

public class DAY11_Remove_Element {
    public static void printArray(int array[]){
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]+" ");
        }
    }
    public static void main(String[] args) {
        // Example 
        Solution11 s=new Solution11();
        int arr[]={3,2,2,3};
        int result=s.removeElement(arr, 3);
        printArray(arr);
        System.out.println();
        System.out.println(result);
    }
}
