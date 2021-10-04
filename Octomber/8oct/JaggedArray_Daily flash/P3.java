import java.io.*;

class P3{

	public static void main(String[] args) throws IOException {
		
		int arr4[][] = new int[3][];

		arr4[0] = new int[2];
		arr4[1] = new int[3];
		arr4[2] = new int[4];
         int sum = 0;
         BufferedReader br = new BufferedReader( new InputStreamReader (System.in)); 

		for (int i = 0 ; i < arr4.length ; i++ ) {
			
			for (int j = 0 ; j < arr4[i].length ; j++ ) {
		        
                System.out.print("Enter the Values =  ");
				arr4[i][j] = Integer.parseInt(br.readLine());
		        sum = sum + arr4[i][j];
			}
		}

             System.out.println("Entered Values are =  ");

		for (int i = 0 ; i < arr4.length ; i++ ) {
			
			for (int j = 0 ; j < arr4[i].length ; j++ ) {
		        
        
			System.out.print(arr4[i][j] + " "); 
                 
				}

			System.out.println();
		}

           System.out.println("Sum is = " + sum);
	}
}