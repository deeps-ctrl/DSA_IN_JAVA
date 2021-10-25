import java.util.*;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int stars = 1;
        int space = n/2;
        int val = 1;
        scn.close();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            int ival = val;
            for(int j = 1; j <= stars; j++){
                System.out.print(ival+"\t");
                if(j <= stars/2){
                    ival++;
                }else{
                    ival--;
                }
            }
            System.out.println("");
            if(i<=n/2){
                space--;
                stars= stars+2;
                val++;
            }
            else{
                val--;
                space++;
                stars=stars-2;
            }
        }

    }
}
