import java.util.Scanner;
public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        int temp = n;
        while(temp != 0){
            temp = temp/10;
            count++;
        }
        int finalNumber = 0;
        for(int i = 1; i <= count; i++){
              int lastDigit = n%10;
              finalNumber = finalNumber + (i * (int)Math.pow(10,lastDigit -1));
              n=n/10;
              
         }
         System.out.println(finalNumber);
       }
}

