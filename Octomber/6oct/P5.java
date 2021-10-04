import java.io.*;

class P5{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		  System.out.println("Enter number of planes");
         int plane = Integer.parseInt( br.readLine());

         System.out.println("Enter number of rows");
         int row = Integer.parseInt( br.readLine());

         System.out.println("Enter number of columns");
         int col = Integer.parseInt( br.readLine());

         int num[][][] = new int[plane][row][col];

          for (int i = 0 ; i < plane  ; i++ ) {
          	
          	for (int j = 0 ; j < row ; j++) {
          		
          		for (int k = 0 ; k < col ; k++ ) {
          
                    num[i][j][k] = Integer.parseInt(br.readLine());			
          			
          		}
          	}
          }
          

           for (int i = 0 ; i < plane  ; i++ ) {
          	
          	for (int j = 0 ; j < row ; j++) {
          		
          		for (int k = 0 ; k < col ; k++ ) {
          
                   if(  num[i][j][k] % 5 == 0){
                   	System.out.print(num[i][j][k] + " ");
                   } 		
          			
          		}
          	}
          }
          
	}
}