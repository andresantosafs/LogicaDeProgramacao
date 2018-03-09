import java.util.Scanner;

public class Uri1009 {
   public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   String A = sc.nextLine();
   double B = sc.nextDouble();
   double C = sc.nextDouble();
   double X = (C * 0.15) + B;
   System.out.printf("TOTAL = R$ %.2f\n",X);
   sc.close();
   }    
}