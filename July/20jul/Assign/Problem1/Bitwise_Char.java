/*Write a Java Program to check if the Bitwise operators given below works on int, long,
char, float, and double data types
1. Bitwise AND (&)
2. Bitwise OR (|*?)
3. Bitwise XOR (^)
And also write down your conclusion in the comments.*/


class Bitwise_Char{

	public static void main(String args[]){

		char a='a';
		char b='b';

		int and_ans;
		int or_ans;
		int xor_ans;


		and_ans= a & b;//96
		System.out.println("Bitwise And = "+and_ans);

        or_ans= a | b;//99
		System.out.println("Bitwise And = "+or_ans);

		xor_ans= a ^ b;//3
		System.out.println("Bitwise And = "+xor_ans);


	}
}