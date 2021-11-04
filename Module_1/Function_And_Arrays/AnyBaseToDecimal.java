import java.util.Scanner;
public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        scn.close();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        // write your code here
        int pow = 1;
        int ans = 0;
        while(n>0){
            int lastDigit = n%10;
            n=n/10;
            ans = ans + (lastDigit*pow);
            pow = pow * b;
        }
        return ans;
     }
}
