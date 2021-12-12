import java.util.Scanner;

public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        scn.close();
        brokenEconomy(arr,data);
    }
    public static void brokenEconomy(int[]arr,int data){
        int floor = -1;
        int ceil = -1;
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(data == arr[mid]){
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }else if(arr[mid]>data){
                ceil = arr[mid];
                hi = mid - 1;
            }else if(arr[mid]<data){
                floor = arr[mid];
                lo = mid + 1;
            }
        }
        System.out.println(floor);
        System.out.println(ceil);
    }
}
