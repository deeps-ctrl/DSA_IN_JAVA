
import java.util.*;

public class DifferenceOfTwoArrays{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
    }
    int n1 = scn.nextInt();
    int[]arr1 = new int[n1];
    for(int i = 0; i < n1; i++){
        arr1[i] = scn.nextInt();
    }
    scn.close();
    int[] ans = new int[n1];
    int i = arr.length - 1;
    int j = arr1.length - 1;
    int k = ans.length - 1;
    int carry = 0;
    while(k >= 0){
        int digit = arr1[j] + carry;
        if(i >= 0){
            digit = digit - arr[i];
        }
        
        if(digit < 0){
            carry = -1;
            digit = digit + 10;
        }else{
            carry = 0;
        }
        ans[k] = digit;
        k--;
        j--;
        i--;
    }
    
    int idx = 0;
    for(idx = 0; idx < ans.length; i++){
        if(ans[idx] != 0){
            break;
        }
    }
    for(int il = idx; il < ans.length; il++){
        System.out.println(ans[il]);
    }
 }

}
