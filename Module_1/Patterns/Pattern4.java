import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int stars = n;
        int space = 0;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= stars; j++){
                System.out.print("*\t");
            }
         
            
            System.out.println("");
            stars--;
            space++;
        }
    }
}
