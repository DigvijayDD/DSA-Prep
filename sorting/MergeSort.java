import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr= {8,5,1,10,12,4,6};
       int[] ans= mSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(ans));
        
    }
    static int[] mSort(int[]arr, int i, int j){
        if(i==j){
            int[] a= new int[1];
            a[0] = arr[i];
            return a;
        }
        int mid = (i+j)/2;
        int[] a =mSort(arr, i, mid);     
        int[] b =mSort(arr, mid+1, j);   
        return mergeArray(a,b);  

    }
    static int[] mergeArray(int[] arr1, int[] arr2){
        int idx = 0;
        int i = 0;
        int j = 0;
        int[] merged = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[idx] = arr1[i];
                i++;
            } else {
                merged[idx] = arr2[j];
                j++;
            }
            idx++;
        }
        while (i < arr1.length) {
            merged[idx] = arr1[i];
            i++;
            idx++;
        }
        while (j < arr2.length) {
            merged[idx] = arr2[j];
            j++;
            idx++;
        }
        return merged;

    }
}
