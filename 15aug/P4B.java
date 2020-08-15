//B] int a = 23334, b = 1010, c = 10000 by<- second largest number is 10000


class P4B{

	public static void main(String[] args) {
		 int a = 23334, b = 1010, c = 10000;	

      if((a > b) && (b>c)){

      	System.out.println(" Second largest number is " + b);
      }

      else if( ( a > b) && ( b > a) )
      	      	System.out.println(" Second largest number is " + b);

      	  else if( ( a > c ) && ( c > b ))
      	      	System.out.println(" Second largest number is " + c);

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