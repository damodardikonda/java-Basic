/* Rotate matrix ==

	1 2 3        7 4 1 
	4 5 6  ===>  8 5 2
	7 8 9		 9 6 3

	1. transpose the given matrix ==> 1 4 7      Reverse elements 7 4 1
									  2 5 8 ===> 				  8 5 2
									  3 6 9                       9 6 3

1 4 7
4 5 8
7 8 9
7 4 1
8 5 4
9 8 7
*/

class Rotate_Matrix{

	public void rotate(int matrix[][]){
		int temp = 0;
		for (int i = 0; i < matrix.length ; i++ ) {
			
			for (int j = 0 ; j < matrix[i].length ; j++) {
				temp= matrix[i][j];
				matrix[i][j] = matrix[j][i];
				System .out.print(" " + matrix[i][j]);
				matrix[j][i] = temp;
				System.out.print(" " + matrix[j][i]);			
			}

			System.out.println();
		}


		for (int i = 0 ; i < matrix.length; i++ ) {
			
			for (int j = 0; j < matrix[i].length ; j++) {
				
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}

		for (int i =  0; i < matrix.length ; i++) {
			
			for (int j = 0 ; j < matrix[i].length/2; j++ ) {
				
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j] =temp;
			}
		}
	}
	public static void main(String[] args) {
		
		int matrix[][] = {{1,2,3} ,{4,5,6},{7,8,9}};

		Rotate_Matrix rm = new Rotate_Matrix();
		rm.rotate(matrix);

		for (int i = 0 ; i < matrix.length; i++ ) {
			
			for (int j = 0; j < matrix[i].length ; j++) {
				
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}
}