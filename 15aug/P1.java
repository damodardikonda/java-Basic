//Program 1: Write a code in Java, to determine whether the given random year is leap. 

import java.util.Scanner;
class P1{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Leap Year");
		int year = sc.nextInt();
      
      if(year % 4 == 0){

      	System.out.println(" Entered year is Leap Year");
      }
      else
      		System.out.println(" Entered year is not a Leap Year");
sc.close();
	}
}