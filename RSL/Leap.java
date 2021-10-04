import java.util.*;

class Leap{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Year");
		int year = sc.nextInt();
   		 boolean leap = false;


   		 if((year % 4 == 0) &&((year % 100 != 0) ||(year % 400 == 0))){

   		 	System.out.println("Leap");

   		 }else
   		 System.out.println("Not a liea");

   		 int c= 0;

   		 int a = (year % 4 == 0 ) ? (c = 1) :((year % 100 == 0) ?(c = 0) : (year % 400 == 0) ? (c = 1) : (c = 0))

   		 if(a == 1)
   		 	System.out.println("Leap ");
   		 else
   		 	System.outt.println(" Not a leap year ");
	}


}