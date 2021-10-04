import java.util.Scanner;
public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        scn.close();
        int min = (int)Math.min(num1,num2);
        System.out.println(min);
        int gcd = 0;
        for(int i = min; i > 0; i--){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
                break;
            }
        }
        int lcm = (num1 * num2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
