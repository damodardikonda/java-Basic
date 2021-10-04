import java.io.*;

class P5{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

       int row = Integer.parseInt(br.readLine());


		for (int i = 1 ; i <= row  ; i++ ) {
			
			for (int j = row ; j >= i ; j-- ) {
				
				System.out.print(" " );
			}

			for (int k = 1 ; k <= i ; k++ ) {
				
				System.out.print(i + " ");
			}
		

		System.out.println();
	}
}
}