import java.util.*;

class Jagged3d{

	public static void main(String[] args) {
		 
          Scanner sc = new Scanner(System.in);

          double darr[][][] = new double[2][3][];//plane , rows
          
          darr[0][0] = new double[2];    //plane , row = colums                                                                                
          darr[0][1] = new double[3];     //plane , row = colums
         darr[0][2]  = new double[4];     //plane , row = colums

          darr[1][0]  = new double[2]; //plane , row = colums
          darr[1][1]  = new double[3];  //plane , row = colums
          darr[1][2]  = new double[4];  //plane , row = colums
          
           for (int i = 0 ; i < 2 ; i++ ) {

           	  System.out.println("Entered for " + i + " Plane");
           	
           	  for (int j = 0 ; j < 3;  j++) {
           	
           	   	  System.out.println("Entered for " + j + " nd row");
           	
           	   	for (int k = 0 ; k < darr[j].length ; k++ ) {
           		
           	   		System.out.print("Enter the values = " );
           	   		darr[i][j][k] = sc.nextInt();
           	   	}


           	   }
           }
          
          System.out.println("EnteredValues are = ");
          for (int i = 0 ; i < 2 ; i++ ) {
           	
           	   for (int j = 0 ; j < darr.length ;  j++) {
           	   	
           	   	for (int k = 0 ; k < darr[j].length ; k++ ) {
           	   		
           	   		darr[i][j][k] = sc.nextInt();
           	   	}
           	   	System.out.println();
           	   }
           }

		}
}