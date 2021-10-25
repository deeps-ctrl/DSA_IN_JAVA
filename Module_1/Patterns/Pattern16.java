import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int space = 2 * n - 3;
        int stars = 1;
        int val = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= stars; j++){
                System.out.print(val+"\t");
                val++;
            }

            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }

            if(i == n){
                stars--;
                val--;
            }

            for(int j = 1; j <= stars; j++){
                val--;
                System.out.print(val+"\t");
            }

            space = space - 2;
            stars++;
            
            System.out.println();
        }


    }
}
