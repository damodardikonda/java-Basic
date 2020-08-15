/*
Write a Program that takes Three integers and prints the minimum
number from them.

I/p: 50 7 56 (Take hard coded value)
O/p: minimum number from 50 7 and 56 is 7.*/


class P7{

	public static void main(String[] args) {
		
		int a = 50 , b = 7 , c= 56;

		 if((a < b) && (a <c)){

      	System.out.println(" Minimun number is " + a);
      }

      else if( ( a > b) && ( c > b) )
      	      	System.out.println(" Minimun number is " + b);

      	  else if( ( a > c ) && ( b > c ))
      	      	System.out.println(" Minimum number is " + c);

      	    
            else 
      	      	System.out.println(" Both are same number " );

	}
}