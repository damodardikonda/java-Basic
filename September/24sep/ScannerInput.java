import java.util.*;

class Scanner_Inp{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Integer Number");
		int x = sc.nextInt();
 

		System.out.println("Enter Character");
		char z = sc.next().charAt(0);


		System.out.println("Enter String ");
		String y = sc.next();


		System.out.println("Enter Double");
		double d = sc.nextDouble();


		System.out.println("Enter Float");
		float d = sc.nextFloat();

         
         System.out.println("Int is " + x);
         System.out.println("Character  is " + z);
         System.out.println("String is " + y);
         System.out.println("Double is " + d);
         System.out.println("Float is " + f);
         
         
         

	}
}