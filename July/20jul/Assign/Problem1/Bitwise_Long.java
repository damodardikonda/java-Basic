/*Write a Java Program to check if the Bitwise operators given below works on int, long,
char, float, and double data types
1. Bitwise AND (&)
2. Bitwise OR (|*?)
3. Bitwise XOR (^)
And also write down your conclusion in the comments.*/


// It is as same as Integer

class Bitwise_Long{

	public static void main(String[] args){

		long a=20l;
		long b=30l;
		long and_ans;
		long or_ans;
		long xor_ans;


        and_ans= a & b;//20
        System.out.println("The Bitwise And Of that Number is "+and_ans);

        or_ans= a | b;//30
        System.out.println("The Bitwise OR Of that Number is "+or_ans);
        
        xor_ans= a ^ b;//100
        System.out.println("The Bitwise And Of that Number is "+xor_ans);

	}
}