import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int space = n-1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            System.out.println("*\t");
            
            space--;
        }
    }
}
