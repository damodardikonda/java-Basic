import java.util.Scanner;

class Salesman{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sale[][] = new int[5][3];
        int total = 0;
		for (int i = 0; i < 5 ; i++ ) {
		 
		         System.out.println(" Enter the 3 product sales by salesman" );

		         for (int j = 0 ; j < 3 ; j++ ) {
		         		
		         		sale[i][j] = sc.nextInt();
		         	}	

		}

          System.out.println(" Entered the 3 product sales by salesman" );

         for (int i = 0; i < 5 ; i++ ) {
		 
		        
		         for (int j = 0 ; j < 3 ; j++ ) {
		         		
		         		total+=sale[i][j]; 
		         	}	
		         	System.out.println("Total Sale of " + i + " is " + total );

		}

		
         for (int i = 0; i < 5 ; i++ ) {
		 
		        
		         for (int j = 0 ; j < 3 ; j++ ) {
		         		
		         		total+=sale[i][j]; 
		         	}	
		         	System.out.println("Total Sale of " + i + " is " + total );

		}




	}
}