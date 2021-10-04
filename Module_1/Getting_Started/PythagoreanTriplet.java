import java.util.Scanner;
public class PythagoreanTriplet {
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    scn.close();
    int max = Math.max(a,Math.max(b,c));
   
    if(a==max){
        if(a*a == (b*b+c*c)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    if(b==max){
        if(b*b == (a*a+c*c)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    if(c==max){
        if(c*c == (a*a+b*b)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
   } 
}
