/*


	 GFG == ha row wise ani column wise sorted ahe

	 [1 , 5 , 7 , 9
	 5,  10, 15 , 20
	 15, 18, 21, 26] hyachya madhe fkt row ani column wise ch sorting ahe


*/


class SearchGFG{

	public static void main(String[] args) {
		
		int matrix[][] = {{1,5,7,9} , {5,10,15,20} ,{15,18,21,26}};
		int mid = 0 , num = 15 , j =0;
		boolean flag = false;
		for (int i = 0 ; i < matrix.length ; i++ ) {
			
			for ( j = 0 ; j < matrix[i].length ; j++ ) {
				
				if(matrix[i][j] == num){
					flag = true;
					break;
				}

			}

		}

		
			if(flag == true)
				System.out.println(" Found ");
			else 
				System.out.println(" Not found");

	}
}