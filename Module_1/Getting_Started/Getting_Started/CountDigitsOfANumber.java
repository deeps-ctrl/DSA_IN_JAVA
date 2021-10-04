import java.util.Scanner;
public class CountDigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int count = 0;
        while(n>0){
            n= n/10;
            count++;
        }
        // Approach with better time complexity
        int count1 = (int)Math.floor(Math.log10(n)+1);
        System.out.println(count);
        System.out.println(count1);
    }
}
