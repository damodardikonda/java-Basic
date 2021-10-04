import java.util.*;

class ReverseArr{

	public static void main(String[] args) {
		
		int a[][] = new int[3][3];
		Random r = new Random();

		for (int i = 0 ; i < a.length ; i++ ) {
			
			for (int j = 0 ; j < a[i].length ; j++ ) {
				
				System.out.print( a[i][j] + " " );
			}
			System.out.println();
		}

		for (int i = 0 ; i < a.length ; i++ ) {
			
			for (int j = 0 ; j < a[i].length ; j++ ) {
				
				a[i][j] = r.nextInt(10);
			}
		}


		for (int i = 0 ; i < a.length ; i++ ) {
			
			for (int j = 0 ; j < a[i].length ; j++ ) {
				
				System.out.print( a[i][j] + " " );
			}
			System.out.println();
		}


		for (int i = 0 ; i < a.length ; i++ ) {
			
			for (int j = a.length-1 ; j >= 0 ; j--) {
				
				System.out.print( a[i][j] + " " );
			}

			System.out.println();
		}

	}
}