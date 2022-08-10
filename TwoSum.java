package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int target=6;
        int[] ans=twosum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twosum(int[] arr , int target){
        int[] ans =new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i] + arr[j]==target){
                    //arr[]=arr[i]
                    //j++;
                    ans[0]=i;
                    ans[1]=j;

                }
            }
        }
        return ans;
    }



}
