import java.io.*;
class P2{

	public static void main(String[] args) throws IOException {
		 
		 BufferedReader br = new BufferedReader( new InputStreamReader (System.in) );

         System.out.print("Enter no of rows");
		 int m = Integer.parseInt( br.readLine());
         
         int sum = 0;
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

               } 
         for (int i = 0 ; i < m ; ++i) {
         	
         	for (int j = 0 ; j < n  ; j++ ) {
         		
         		
               if(arr[i][j] % 2 == 0 ){

                  System.out.println( arr[i][j] + " is even elements");
                  sum = sum+ arr[i][j];
               }
         	}
         	System.out.println();
         }

          System.out.println("The sum is = " + sum);
	}
}