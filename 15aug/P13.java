/*

Program 13: Find whether a number is a Neon number or not. Neon Number -> A
neon number is a number where the sum of digits of square of the number is equal to
the number
e.g. 9 is a Neon number but how?
Square of 9 is 81, and sum of digits of 81 i.e. 8 + 1 is 9 again
Input: 9
Output: 9 is a neon number
(also give a thought on how many possible neon numbers are there

*/

class P13{

	public static void main(String[] args) {
		
		int num = 9 ;
		int sum =0 , rem =0;
		int temp = num;

		int square = num * num ;

		while(square != 0){
             
             rem = square % 10 ;
             sum = sum + rem;
             square = square / 10;

		}

		if(sum == temp){

			System.out.println(temp + " is Neon Number");
		}
	}
}