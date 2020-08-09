/* Write a java Program to check if the Bitwise operator ~(compliment) works with
operands with data type int, long, float, double and char.*/




class Comp_Int{
	public static void main(String[] args) {
		
		int num=11;
		int ans=0;

		ans=~num;//-12

		System.out.println("~ complementory on integer is "+ans);


       /* float num1=23.5f;
	   float ans1=0f;

		ans1= ~ num1;//bad unary operand type error

		System.out.println("~ complementory on Floating is "+ans1);


       double num2=36.0;
	   double ans2=0;

		ans2= ~ num2;//bad unary operand type error

		System.out.println("~ complementory on Double is "+ans2);
		*/

       long num3=87l;
		long ans3;

		ans3=~num3;//-88

		System.out.println("~ complementory on Long is "+ans3);
 

        char num4='2';
		int ans4;

		ans4=~num4;//-51

		System.out.println("~ complementory on Character is "+ans4);






	}
}