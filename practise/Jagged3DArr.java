import java.util.*;
class Jagged3DArr{

	public static void main(String[] args) {
		
		double d[][][] = new double[2][3][];
			double d[0][0] =  new double[2];
			double d[0][1] = new double[3];
			double d[0][2] = new double[4];

			double d[1][0] = new double[2];
			double d[1][1] = new double[3];
			double d[1][2] = new double[4]; 
											

		Random r = new Random();
			for (int i = 0 ; i < 2;  i++) {
				
				for (int j = 0; j < a[i].length ; j++) {
					
					for (int k = 0  ; k < a[i][j].length  ; k++ ) {
						
						a[i][j][k] = r.nextInt(100);
					}
				}
			}



			for (int i = 0 ; i < 2;  i++) {
				
				for (int j = 0; j < a[i].length ; j++) {
					
					for (int k = 0  ; k < a[i][j].length  ; k++ ) {
						
						System.out.print(a[i][j][k] + " ");
					}

					System.out.println();
				}
				System.out.println();
			}
	}
}