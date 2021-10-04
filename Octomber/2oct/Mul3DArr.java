import java.io.*;

class Mul3DArr{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));

		System.out.println(" Enter Planes");
		int plane = Integer.parseInt(br.readLine());


		System.out.println(" Enter Rows");
		int row = Integer.parseInt(br.readLine());


		System.out.println(" Enter Columns");
		int col = Integer.parseInt(br.readLine());

		int[][][] marr = new int[plane][row][col];

		for (int i = 0 ; i < plane ; i++) {
			
			for (int j = 0 ; j < row ; j++ ) {
				
				for (int k = 0 ; k < col ;  k++) {
					
					 marr[i][j][k] = Integer.parseInt(br.readLine());
				}

				System.out.println();
			}

			System.out.println();
		}

        System.out.println("Entered 1st Plane is =  ")
		for (int i = 0 ; i < plane ; i++ ) {
			
			if(i == 1)
				System.out.println("Entered 2nd  Plane is=  ")
			for (int j = 0 ;  j < row ; j++ ) {
				
				for (int k = 0 ; k < col ; k++ ) {
					
					System.out.print(marr[i][j][k] + " ");
				}
				System.out.println();
			}

			System.out.println();
		}

		System.out.println();
	}
}