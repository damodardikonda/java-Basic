//C] int a = 1999, b = 2000, c = 1998 <- second largest number is 1999


class P4C{

	public static void main(String[] args) {
		
		int a = 1999, b = 2000, c = 1998;

		 if((a > b) && (b>c)){

      	System.out.println(" Second largest number is " + b);
      }

      else if( ( a > b) && ( b > a) )
      	      	System.out.println(" Second largest number is " + b);

      	  else if( ( a > c ) && ( b > a ))
      	      	System.out.println(" Second largest number is " + a);

      	    else if( ( b > c ) && ( c>a ))
      	      	System.out.println(" Second largest number is " + c);
           
             else if( ( b > a ) && ( c>b ))
      	      	System.out.println(" Second largest number is " + b);
  
             else if( ( c > a ) && ( a >b ))
      	      	System.out.println(" Second largest number is " + a);
  
            else 
      	      	System.out.println(" Both are same number " );

	
	}
}