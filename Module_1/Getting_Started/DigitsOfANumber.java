import java.util.Scanner;
public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int count= 0;
        int num = n;
        while(num>0){
            num = num/10;
            count++;
        }
        int div = (int)Math.pow(10,count-1);
        while(div > 0){
            int firstDigit = n/div;
            System.out.println(firstDigit);
            n = n%div;
            
            div = div/10;
        }
    }
}
