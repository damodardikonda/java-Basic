class Arr3D{

	public static void main(String[] args) {
		
		int row = 3 , col = 3 , plane = 2;

		int marr[][][] = {{{1,2,3} , {4,5,6} , {7,0,0}} ,{{10,11,12} , { 13,14,15} ,{16,17,18}}};

        System.out.println("1st plane is = ");

        for (int i = 0 ; i < plane ; i++ ) {
        	
        	if(i == 1)
        		System.out.println("2nd plane is =  ");
             for (int j = 0 ; j < row ; j++) {
             	
             	for (int k = 0 ; k < col ; k++ ) {
             		
             		System.out.print(" " + marr[i][j][k] );
             	}

             	System.out.println();
             }

             System.out.println();
        }
	}
}