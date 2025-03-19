import java.lang.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//      int[] nums=new int[] {2,7,11,15};
//        int[] nums=new int[] {3,2,4};
        int[] nums=new int[] {3,3};
        int target=6;

        int[] arr=twoSum(nums,target);

        System.out.println(Arrays.toString(arr));

    };
    public static int[] twoSum(int[] nums, int target){
        int[] index=new int[2];

        int sum=0;
        int arrayIndex=0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
               sum=nums[i]+nums[j];
                if (sum==target) {
                    index[0]=i;
                    index[1]=j;
                    break;
                }
            }

        }

        return index;
    }
}