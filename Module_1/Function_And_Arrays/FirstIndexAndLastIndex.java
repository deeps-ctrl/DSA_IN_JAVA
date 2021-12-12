import java.util.*;
public class FirstIndexAndLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = scn.nextInt();
        }
        
        int n = scn.nextInt();
        scn.close();
        firstIndex(arr,n);
        lastIndex(arr,n);
    }
    public static void firstIndex(int[]arr, int n){
        int fi = -1;
        int lo = 0;
        int hi = arr.length - 1;
       
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(arr[mid]==n){
                fi = mid;
                hi = mid - 1;
            }else if(arr[mid] > n){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        System.out.println("First Index is "+fi);
    }

    public static void lastIndex(int[]arr, int n){
        int li = -1;
        int lo = 0;
        int hi = arr.length - 1;
       
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(arr[mid]==n){
                li = mid;
                lo = mid + 1;
            }else if(arr[mid] > n){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        System.out.println("Last Index is "+li);
    }
}
