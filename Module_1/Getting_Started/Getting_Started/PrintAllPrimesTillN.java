import java.util.Scanner;
public class PrintAllPrimesTillN {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        scn.close();
        for(int i = low; i <= high; i++){
            int number = i;
            int factor = 0;
            // optimisation for finding the prime
            // div*div <= n
            for(int j = 2; j*j <= number; j++){
                if(number%j==0){
                    factor++;
                    break;
                }
            }
            if(factor==0){
                System.out.println(number);
            }
        }
    }
}
