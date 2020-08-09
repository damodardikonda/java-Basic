
import java.util.Scanner;

class Even_Odd{
	
	
       int evenOdd(int number){
        
			if(number%2==0)
                      
                      System.out.println("The Number is an Odd Number");				
			

			else

				System.out.println("The Number is an Odd Number");
			
			return 0;            
        }

        public static void main(String[] args){
           


         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number");
         int number = sc.nextInt();
           
          Even_Odd no = new Even_Odd();
          no.evenOdd(number);
      
        

	}



}