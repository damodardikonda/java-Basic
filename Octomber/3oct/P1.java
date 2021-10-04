import java.io.*;

class P1{

	public static void main(String[] args) throws IOException{
		
            BufferedReader br = new BufferedReader( new InputStreamReader (System.in) );

            System.out.println(" Enter The Length of Array ");
            int n =Integer.parseInt( br.readLine());

            int[][] arr1 = new int[n][n];
            int[][] arr2 = new int[n][n];

            int num[][] = new int[n][n];

             System.out.println("Enter 1st Array");
             for (int i = 0 ; i < n ; i++ ) {
             	
             	for (int j = 0 ; j < n  ; j++ ) {
             		
             		arr1[i][j] = Integer.parseInt( br.readLine());
             	
             	}
             
             }

            
              System.out.println("Enter 2nd Element");

             for (int i = 0 ; i < n ; i++ ) {
             	
             	for (int j = 0 ; j < n  ; j++ ) {
             		
             		arr2[i][j] = Integer.parseInt( br.readLine());
             	
             	}
             
             }


             for (int i = 0 ; i < n ; i++ ) {
             	
             	for (int j = 0 ; j < n  ; j++ ) {
                        
                        num[i][j] = 0;
                   for ( int k = 0 ; k < n ; k++ ) {
                   			
                   	
             		num[i][j]= num[i][j]+arr1[i][k] * arr2[k][j];
             	
             	}
             	}

             	System.out.println();
             
             }

              System.out.println("Entered Multiplication of matrix are =");
            for (int i = 0 ; i < n ; i++ ) {
             	
             	for (int j = 0 ; j < n  ; j++ ) {
                                               	
             	System.out.print(	num[i][j] + " ");
                          	
             	}

             	System.out.println();
             
             }

	}
}