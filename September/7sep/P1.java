import java.util.Scanner;

class P1{
	
	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();  // 10
       int b = sc.nextInt();   //20

     

       System.out.println("Before swap " + a + " and " + b);


       a=a+b;  //30
       b= a-b; // 10

       a = a - b; // 30-10

       System.out.println("After swap " + a + " and "+ b);

	}
}