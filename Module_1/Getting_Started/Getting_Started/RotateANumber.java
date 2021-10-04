import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        scn.close();
        int temp = n;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        // Handling the edge case
        k = k % count;
        if (k < 0) {
            k = k + count;
        }
        // code for the rotation
        int result = 0;
        for (int i = 1; i <= k; i++) {
            int lastDigit = n % 10;
            int remDigit = n / 10;
            result = remDigit + (lastDigit * (int) (Math.pow(10, count - 1)));
            n = result;
        }
        System.out.println(n);
    }

    }

//     Alternative Approach
//     int div = 1;
//     int mult = 1;for(
//     int i = 1;i<=count;i++)
//     {
//         if (i < k) {
//             div = div * 10;
//         } else {
//             mult = mult * 10;
//         }

// }

// int q = n / div;
// int r = n % div;

// int result = r * mult + q;
// System.out.println(result);
