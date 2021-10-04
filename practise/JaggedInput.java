import java.io.*;

class JaggedInput{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		System.out.println("Enter the lengths");
		int l1 = Integer.parseInt(br.readLine());
		int l2 = Integer.parseInt(br.readLine());
		int l3 = Integer.parseInt(br.readLine());
		
		int ar[][] = new int[3][];

		ar[0] = new int[l1];
		ar[1] = new int[l2];
		ar[2] = new int[l3];

		for (int  i = 0 ; i < ar.length ; i++ ) {
			
			for (int j = 0 ; j < ar[i].length ; j++ ) {
				
				ar[i][j] = Integer.parseInt(br.readLine());
			}
		}

		
		for (int  i = 0 ; i < ar.length ; i++ ) {
			
			for (int j = 0 ; j < ar[i].length ; j++ ) {
				
			 System.out.print(	ar[i][j] + " " );
			}

			System.out.println();
		}

	}
}