import java.io.*;

class CharArr{

	public static void main(String[] args) throws IOException {
		 
		 BufferedReader br = new BufferedReader( new InputStreamReader (System.in));
 
         System.out.println("Enter the Rows");
         int m =Integer.parseInt( br.readLine());


         System.out.println("Enter the coloumn");
         int n = Integer.parseInt( br.readLine()) ;

        char ch = 'A';
		int arr[][] = new int[m][n];

		for (int i = 0 ; i < m ; ++i ) {
			
			for (int j = 0 ; j < n ; j++ ) {
				
				arr[i][j] = ch ;
				ch++;
			}

			}

        
		for (int i = 0 ; i < m ; ++i ) {
			
			for (int j = 0 ; j < n ; j++ ) {
				
				System.out.print((char)arr[i][j] + " ");
				
			}
                 System.out.println();
			}

       

	}
}