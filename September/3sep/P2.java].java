import java.util.Scanner;

class P1{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number");
		int num = sc.nextInt();
       
       int fact=0;

		for (int i = 1; i <= num ; i++ ) {
		       
		       fact = fact * i;

		       System.out.println(" Factorial of " + i + " is " + fact);	
		}}}