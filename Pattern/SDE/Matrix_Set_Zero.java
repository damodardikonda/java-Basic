import java.util.*;

class Set_Matrix_Zero{

	static void setZero(int matrix[][]){

		int col0 = 1 , max_length = matrix.length , cols = matrix[0].length ;

		for (int i = 0 ; i < max_length ; i++ ) {
			
			if(matrix[i][0] == 0) 
				cols = 0;

			for (int j = 1 ;j < cols ; j++ ) {
				
				if(matrix[i][j] == 0){

					matrix[i][0] = matrix[0][j] = 0;
				}
			}
		}

		for (int i = max_length-1; i >= 0  ; i-- ) {
			
			for (int j = cols-1 ; j >= 1  ; j-- ) {
				
				if(matrix[i][0] == 0 || matrix[0][j] == 0){

					matrix[i][j] =0;
				}

				if(col0 == 0)
					matrix[i][0] = 0;
			}
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[4][4];

		for (int i = 0 ; i < matrix.length ; i++ ) {
			

			for (int j = 0 ; j < matrix[i].length ;j++ ) {
					
					System.out.println( " Enter " + i+1 +" row and " + j+1 + " column value " );
					matrix[i][j] = sc.nextInt();	
			}
		}

		setZero(matrix);

		for (int i = 0 ; i < matrix.length ; i++ ) {
			
			for (int j = 0 ; j < matrix[i].length ; j++ ) {
				
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}
}