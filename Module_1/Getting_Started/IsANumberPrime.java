import java.util.*;

public class IsANumberPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
  
        // write ur code here
        int t = scn.nextInt();
        scn.close();
        for(int i = 1; i <= t; i++){
            int number = scn.nextInt();
            int factor = 0;
            for(int j = 2; j < number; j++){
                if(number%j==0){
                    factor++;
                    System.out.println("not prime");
                    break;
                }
            }
            if(factor==0){
                System.out.println("prime");
            }
        }
    }
}
