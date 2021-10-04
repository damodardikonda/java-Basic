/*

	samja 1 robot ae tyala start pasun end paryt jayc ahe tr possible ways kiti

		00		01		02
	
	00	start

	01					end


	tr 1. ikde to fkt right ani down madhech move karu shakto. ani to right madhe fkt column-1 ani 
		  down madhe row-1 madhech move karu shakto.
		  i.e right = column-1
		  	  down = row - 1
		  	  total (movement) = row+column-2;
		2. right = column -1
		3. ata for loop ghya to i ha column samposto parynt firel;
		4. res = total - row + i / i; hach asel


*/

class FindStartEnd{
	public int findPaths(int matrix[][]){

		int col = matrix[0].length , row = matrix.length;
		int total = row + col - 2;
		int right = col-1;
		double result = 1;

		for (int i =  1 ; i <= right ; i++) {
			
			result =result * (total - right + i ) / i;
		}
		return (int)result;
	}
	public static void main(String[] args) {
		
		FindStartEnd fse =  new FindStartEnd();

		int matrix[][] ={{1 , 0 , 0} , {0,0,1}};

		int max = fse.findPaths(matrix);
		System.out.println(" maximum path is " + max);

	}
}