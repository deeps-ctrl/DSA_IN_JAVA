import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int stars = n/2 + 1;
        int space = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= stars; j++){
                System.out.print("*\t");
            }
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= stars; j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                space=space+2;
                stars--;
            }
            else{
                space = space-2;
                stars++;
            }
            System.out.println("");
        }

    }
}
