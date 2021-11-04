import java.util.*;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        scn.close();
        int numInD = getNumberInDecimal(n, sourceBase); // numInD -> number in Decimal
        int dToGB = getNumberInGivenBase(numInD, destBase);// dToGB -> decimal to given base
        System.out.print(dToGB);
    }

    public static int getNumberInDecimal(int n, int sourceBase) {
        int pow = 1;
        int result = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            result = result + (lastDigit * pow);
            pow = pow * sourceBase;
        }
        return result;
    }

    public static int getNumberInGivenBase(int n, int destBase) {
        int pow = 1;
        int result = 0;
        while (n > 0) {
            int rem = n % destBase;
            n = n / destBase;
            result = result + (rem * pow);
            pow = pow * 10;
        }
        return result;
    }
}