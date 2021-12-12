import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        reverseArray(arr);
    }
    public static void reverseArray(int[]arr){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo < hi){
            int temp = arr[hi];
            arr[hi] =  arr[lo];
            arr[lo] = temp;
            lo++;
            hi--;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
