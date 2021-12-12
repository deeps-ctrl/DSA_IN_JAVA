import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int rotate = scn.nextInt();
        scn.close();
        rotateArray(arr,rotate);
        display(arr);
    }
    public static void reverse(int[]arr,int lo,int hi){
        while(lo < hi){
            int temp = arr[hi];
            arr[hi] = arr[lo];
            arr[lo] = temp;
            lo++;
            hi--;
        }
    }
    public static void rotateArray(int[]arr, int rotate){

        rotate = rotate % arr.length;
        if(rotate < 0){
            rotate = rotate + arr.length;
        }

        reverse(arr, 0, arr.length - rotate -1);

        reverse(arr, arr.length - rotate, arr.length - 1);

        reverse(arr, 0, arr.length -1);
    }
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
}
