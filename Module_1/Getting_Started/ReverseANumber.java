import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     scn.close();
     while(n>0){
         int lastDigit = n%10;
         System.out.println(lastDigit);
         n=n/10;
     }
    }
}
