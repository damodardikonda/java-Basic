/*	class PrimeNumbers
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (i = 1; i <= 100; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }
}	

*/

class Primenumb{

	public static void main(String[] args) {
		
		String p = " ";
		for (int i = 0 ; i <=100 ;  i++) {
		
		int flag = 0;	
			for (int j = i ; j >= 1; j--) {
				
				if( i% j == 0){

					flag++;
				}
			}

			if(flag == 2 ){

				p = p + i + " ";
			}
		}

		System.out.println(p);
	}
}