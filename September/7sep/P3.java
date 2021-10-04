import java.util.Scanner;

class P3{
	
	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);

         int a = sc.nextInt();

         int b = sc.nextInt();

         int rem = a % b;

         int q = a/b;

         System.out.println(" Input" + a+ " " +b);
         System.out.println(" Quotient" + q);
         System.out.println(" Remainder" + rem);

     }

 }