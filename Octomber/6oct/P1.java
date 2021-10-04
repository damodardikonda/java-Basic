import java.io.*;

class P1{
	
	public static void main(String[] args) throws IOException{

         BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
         
         int sum = 0;

         System.out.println("Enter number of planes");
         int plane = Integer.parseInt( br.readLine());

         System.out.println("Enter number of rows");
         int row = Integer.parseInt( br.readLine());

         System.out.println("Enter number of columns");
         int col = Integer.parseInt( br.readLine());

          int num[][][] = new int[plane][row][col];

           
          System.out.println("Enter values");
          for (int i = 0 ; i < plane  ; i++ ) {
          	
          	for (int j = 0 ; j < row ; j++) {
          		
          		for (int k = 0 ; k < col ; k++ ) {
          
                    num[i][j][k] = Integer.parseInt(br.readLine());			
          			sum = sum + num[i][j][k];
          		}
          	}
          }

            System.out.println("Sum is " + sum);
	}
}