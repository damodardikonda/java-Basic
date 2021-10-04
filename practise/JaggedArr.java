import java.util.*;

class JaggedArr{

	public static void main(String[] args) {
		
		int arr[][] = new int[3][];

		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];

		Random r = new Random();

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			for (int j = 0 ; j < arr[i].length ; j++ ) {
			
				arr[i][j] =	r.nextInt(100);	
			}
		}

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			for (int j = 0 ; j < arr[i].length ; j++ ) {
			
			System.out.print(arr[i][j] + " ");	
			}

			System.out.println();
		}

	}
}