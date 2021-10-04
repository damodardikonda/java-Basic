import java.util.*;

class Prime{

	public static void main(String[] args) {
		

          Scanner sc = new Scanner( System.in);
          
          String prime = "1";
          int range =  sc.nextInt();

          for (int i = 2 ; i <=range ; i++ ) {
          	
          	   int count = 0;

          	   for (int j = i ; j >= 1 ; j-- ) {
          	   	
          	   	      if( i % j == 0){

          	   	      	   count++;
          	   	      }
          	   }

          	   if(count == 2){

          	   	    prime = prime + " " + i;
          	   }
          }


          System.out.println(prime);
	}
}