import java.util.*;

class P4{
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

       System.out.println(" Enter Rows ");
        int row = sc.nextInt();

        int num[] = new int[10];
       
        for (int i = 0 ; i < row ; i++) {
            System.out.print("Enter Elements = ");  	
         	num[i] = sc.nextInt();
         } 

           System.out.print("Entered Elements are = ");           
           for (int i = 0 ; i < row ; i++) {
  	
         System.out.println( num[i] + " " );
         } 

        System.out.println("Enter the position");
        int pos = sc.nextInt();

         System.out.println("Enter the Number");
         int number = sc.nextInt();
       int i = 0 ; 
        for ( i = row - 1 ; i >= pos  ; i-- ) {
        	
        	num[i+1] = num[i];
        }

        num[pos-1] = number;


        System.out.println("Entered Elements are = ");
        for ( i = 0 ; i < row ; i++ ) {
        	
        	System.out.print(num[i] + " ");
        }

	}
}