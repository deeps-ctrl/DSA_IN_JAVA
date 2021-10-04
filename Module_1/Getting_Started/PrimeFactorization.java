import java.util.Scanner;
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for(int i = 2; i*i <= n; i++){
            while(n%i==0){
                n=n/i;
                System.out.print(i+" ");
            }
        }
        if(n != 1){
            System.out.print(n);
        }
    }
}
// Approach that i have come up
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// while(n!=1){
//     for(int i = 2; i <= n; i++){
//         if(n%i==0){
//             System.out.print(i+" ");
//             n=n/i;
            
//             break;
//         }
//     }
// }