

/*Write a Java Program to check if the Bitwise operators given below works on int, long,
char, float, and double data types
1. Bitwise AND (&)
2. Bitwise OR (|*?)
3. Bitwise XOR (^)
And also write down your conclusion in the comments.*/





class Bitwise_And{

	public static void main(String[] args) {
	

	    int num1=20;
	    int num2=30;
	    int and_ans1=0;
	    int or_ans1=0;
	    int xor_ans1;

	    and_ans1= num1 & num2;  //20
	    System.out.println("Bitwise AND for integer= "+and_ans1);

	    or_ans1= num1 | num2;  //30
	    System.out.println("Bitwise OR for integer="+or_ans1);

	    xor_ans1= num1 ^ num2;  //10
	    System.out.println("Bitwise XOR for integer="+xor_ans1);




	}
}