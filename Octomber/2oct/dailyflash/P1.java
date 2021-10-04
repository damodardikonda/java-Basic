import java.io.*;
class P1{

	public static void main(String[] args) throws IOException {
		 
		 BufferedReader br = new BufferedReader( new InputStreamReader (System.in) );

         System.out.print("Enter no of rows");
		 int m = Integer.parseInt( br.readLine());
         
         System.out.print("Enter no of coloumns");
		 int n = Integer.parseInt( br.readLine());
		 
         int arr[][] = new int[m][n];

         for (int i = 0; i < m ; i++ ) {
         	
         	for (int j = 0 ; j < n ; j++ ) {
         		
                 arr[i][j] = Integer.parseInt( br.readLine());
         	}
         }
         
         for (int i = 0 ; i < m ; ++i) {
         	
         	for (int j = 0 ; j < n  ; j++ ) {
         		
         		System.out.print(arr[i][j] + " ");
         	}
         	System.out.println();
         }

         for (int i = 0 ; i < m ; ++i) {
         	
         	for (int j = 0 ; j < n  ; j++ ) {
         		if(i==j)
         		System.out.print( "Digonal element are = " + arr[i][j]);
         	}
         	System.out.println();
         }


	}
}