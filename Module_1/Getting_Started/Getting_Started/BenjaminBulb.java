import java.util.Scanner;
public class BenjaminBulb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        // perfect squares have 2n+1 factors
        for(int i = 1; i*i <= n; i++){
            System.out.println(i*i);
        }
    }
}
// It is more of puzzle 