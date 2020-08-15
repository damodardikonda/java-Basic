/*
Program 4: Write a program to find second largest number from the given 3 numbers.
Take following set of inputs:-
A] int a = 10, b = 20, c = 30; <- second largest number is 20
*/

class P4A{

	public static void main(String[] args) {
		
      int a = 10, b = 20, c = 30;	

      if((a > b) && (b>c)){

      	System.out.println(" Second largest number is " + b);
      }

      else if( ( b>a) && (a>c) )
      	      	System.out.println(" Second largest number is " + a);

      	  else if( ( b>a ) && ( c>b ))
      	      	System.out.println(" Second largest number is " + b);
  
            else 
      	      	System.out.println(" Both are same number " );

  }
}