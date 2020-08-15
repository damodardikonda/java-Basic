/*
Write a Java program, take a number (Hardcoded) and print the count of
its digits.
Input: enter any number: 234
Output: number of digits: 3
*/

class P24{

	public static void main(String[] args) {
		
		int num = 234;
		int count = 0 , rem = 0 ;
		while(num !=0){

			rem = num % 10;
			count = count + 1;
			num = num / 10;

		}

		System.out.println(" Number of counts = " + count);
	}
}