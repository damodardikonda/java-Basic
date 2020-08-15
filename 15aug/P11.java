/*

Write a Program that accepts an integer from user and prints all of its
perfect divisors.
Input: 24
Output: Perfect Divisors of 24 are: 2 3 4 6 8 12

*/

class P11{
	
	public static void main(String[] args) {
		
		int num = 24;

		for(int i = 2 ; i < num ; i++){

			if(num % i == 0){

				System.out.print(i + " ");
			}
		}
	}

}