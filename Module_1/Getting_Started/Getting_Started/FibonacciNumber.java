import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        scn.close();
        for(int i = 1; i <= n; i++){
            System.out.println(firstNum);
            int sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}
