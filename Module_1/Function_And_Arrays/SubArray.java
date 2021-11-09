// import java.io.*;
import java.util.*;

public class SubArray{

public static void main(String[] args) throws Exception {
    // write your code here
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scn.nextInt();
        }
        
        subArray(arr);
        scn.close();
 }
 
 public static void subArray(int[]arr){
    for(int i = 0; i < arr.length; i++){
        for(int j = i; j < arr.length; j++){
            for(int k = i; k <= j; k++){
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }
 }

}
