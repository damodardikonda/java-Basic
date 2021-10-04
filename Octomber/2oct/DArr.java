import java.util.*;

class DArr{

     public static void main(String[] args) {
     	
     	Scanner sc = new Scanner(System.in);
     	
     	int row = sc.nextInt();
     	int col = sc.nextInt();

     	Double[][] dd = new Double[row][col];

     	for (int i = 0 ; i < row ; ++i ) {
     		
     		for (int j = 0 ; j < col ; j++ ) {
     		     		
     		     		System.out.print("Enter Double Values");
     		     		dd[i][j] = sc.nextDouble();

     		     	}   
                  
                  System.out.println();
     	  	}

          
          for (int i = 0 ; i < row ; ++i ) {
     		
     		for (int j = 0 ; j < col ; j++ ) {
     		     		
     		     		System.out.print( dd[i][j] + " ");
     		     		
     		     	}   
                  
                  System.out.println();
     	  	}



     }
}