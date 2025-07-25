import java.lang.reflect.Array;
import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr={8,3,1,2,4,6,5,66};
       sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
       int pi= pivot(arr, s, e);

        sort(arr, s, pi-1);//left
        sort(arr, pi+1, e);//right
    }
    static int pivot(int[] arr,int s, int e){
        Random r =new Random();
        int x= r.nextInt(e-s+1)+s;
        int tt=arr[x];
        arr[x]=arr[e];
        arr[e]=tt;

        int element = arr[e];
        int pi=s;
        for(int i=s;i<e;i++){
            if(element>arr[i]){
                int temp= arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
    }
    int temp = arr[e];
    arr[e]=arr[pi];
    arr[pi]=temp;
    return pi;
}

}

