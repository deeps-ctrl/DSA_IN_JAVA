import java.util.Scanner;
// For applying binary search array has to be in sorted manner
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        scn.close();
        int result = binarySearch(arr,0,arr.length - 1,k);
        System.out.println(result);
        
    }
    public static int binarySearch(int[]arr,int lo, int hi,int k){
        int foundAt = -1;
        while(lo <= hi){
        int mid = (lo + hi)/2;
        if(arr[mid] == k){
            foundAt = mid;
            break;
        }else if(arr[mid]>k){
            hi = mid - 1;
        }else{
            lo = mid + 1;
        }
    }
        return foundAt;
    }
}
