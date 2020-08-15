/*
Write a java program to calculate the power of a given number.
Input: number 10, power: 2
Output: 10 to the power 2 is 100
*/

class P10{

	public static void main(String[] args) {
		
		int num = 10 ;
		int power = 2;
		
		if(power == 2){

			System.out.println(num*num);
		}

		if(power == 3){

			System.out.println(num*num*num);
		}
	}
}