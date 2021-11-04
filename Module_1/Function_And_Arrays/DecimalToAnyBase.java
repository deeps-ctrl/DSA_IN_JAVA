import java.util.Scanner;
public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
    }
    public static int getValueInBase(int n, int b){
        // write code here
        int pow = 1; // 2 ^ 0
        int result = 0;
        while(n > 0){
            int rem = n %b;
            result = result + (rem * pow);
            pow = pow * 10;
            n = n / b;
        }
        return result;
    }
}
