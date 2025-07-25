import java.util.*;;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4,9,-5};
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            int last=arr.length-1-i;
            int MaxIndex = GetMaxIndex(arr, 0, last);
            int temp = arr[MaxIndex];
            arr[MaxIndex] = arr[last];
            arr[last]= temp;
        }
    }
    static int GetMaxIndex(int[] arr, int start, int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max= i;
            }
        }
        return max;
    }
}
