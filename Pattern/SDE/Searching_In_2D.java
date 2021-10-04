/*
 
 Leetcpde cha problem ahe

	[1 , 3 ,5 ,7
	 10,13,16,20
	 23,45,67,78] hyachya madhe pratyek row ani column ha sorted ahe ie. 1 row cha shwvat ha dusrya 
	 column chya pahilya value peksha kami ahe.


	 GFG == ha row wise ani column wise sorted ahe

	 [1 , 5 , 7 , 9
	 5,  10, 15 , 20
	 15, 18, 21, 26] hyachya madhe fkt row ani column wise ch sorting ahe


	 *****Me solve kelela problem ha fkt leetcode sathi upyogacha tharto GFG sathi nahi
*/

class SearchArray{

	public void findNum(int matrix[][] , int num){

		int i = 0 , j = matrix[0].length-1;
		
		while(i < matrix.length && j >= 0){

			if(matrix[i][j] == num){
				int x= i+1;
				int y = j+1;
				System.out.println(" number found at " + x + " row and " + y + " column ");
				break;
			}

			if(matrix[i][j] >= num)
				j--;
			else 
				i++;
		}
	}
	public static void main(String[] args) {
		
		int matrix[][] = {{1,3,5,7} ,{10,11,16,20},{23,30,34,50}};

		SearchArray sa = new SearchArray();
		sa.findNum(matrix, 16);
	}
}