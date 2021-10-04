
import java.util.*;
class Arr3D{
	
	public static void main(String[] args) {

		Scanner  sc =  new Scanner(System.in);

		System.out.println("Enter the Plane : ");
		int plane = sc.nextInt();

		System.out.println("Enter the row : ");
		int row = sc.nextInt();
			
		System.out.println("Enter the Column : ");
		int col = sc.nextInt();
		
		int a[][][] = new int[plane][row][col];

		Random rand = new Random();

		for (int  i = 0 ; i < plane ; i++ ) {
			
			for (int j = 0 ; j < row ; j++ ) {
				
				for (int k = 0 ; k < col ; k++ ) {
				
					a[i][j][k]	= rand.nextInt(100);
				}
			}
		}



		for (int  i = 0 ; i < plane ; i++ ) {
			int x = i+1;
			System.out.println(" Plane is = " + x );
			for (int j = 0 ; j < row ; j++ ) {
				
				for (int k = 0 ; k < col ; k++ ) {
				
				System.out.print(	a[i][j][k] + " "	);
				}

				System.out.println();
			}
		}
	}
}