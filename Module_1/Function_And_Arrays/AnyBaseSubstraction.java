import java.util.*;
  
  public class AnyBaseSubstraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      scn.close();
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int ans = 0;
       int c = 0;
       int pow = 1;
       
       while(n1 > 0 || n2 > 0){
           int d1 = n1 % 10;
           int d2 = n2 % 10;
           n1 = n1 / 10;
           n2 = n2 / 10;
           int d = 0;
           if(d2 + c < d1){
               d = (d2 + b + c) - d1;
               c = -1;
           }else{
               d = (d2 + c)- d1;
               c = 0;
           }
           ans = ans + (d*pow);
           pow = pow * 10;
       }
       return ans;
   }
  
  }
