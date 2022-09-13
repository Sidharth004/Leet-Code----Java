package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m");
        int m=sc.nextInt();

        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter nums1");
        int[] nums1=new int[m+n];
        for(int i=0;i<(m+n);i++){
            nums1[i]=sc.nextInt();
        }
        System.out.println("Enter nums2");
        int[] nums2=new int[m];
        for(int j=0;j<n;j++){
            nums2[j]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        //call the merge function
        merge(nums1 , m , nums2,n);

    }
         static int[] merge(int[] nums1 , int m , int[] nums2 , int n){

        //int[] arr=new int[m+n];
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        sort(nums1);
        System.out.println(Arrays.toString(nums1));

        return nums1;
    }
    static int[] sort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

        static void swap(int[] arr, int first , int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
    }


