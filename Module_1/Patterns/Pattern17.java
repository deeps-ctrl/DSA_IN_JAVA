import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int space = n/2;
        int stars = 1;
        for(int i = 1; i <= n; i++){
          for(int j = 1; j <= space; j++){
             
             if(i ==(n/2)+1){
                System.out.print("*\t"); 
             }
             else{
                 System.out.print("\t");
             }
          }
          for(int j = 1; j <= stars; j++){
              System.out.print("*\t");
          }
          System.out.println("");
          if(i <= n/2){
              stars++;
              
          }else{
              stars--;
          }
        }
    }
}
