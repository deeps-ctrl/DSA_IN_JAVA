import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        scn.close();
        for(int i = 1; i <= n; i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print(firstNum+"\t");
                int sum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = sum;
            }
            System.out.println("");
            
        }
    }
}
