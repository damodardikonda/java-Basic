/*What will be the output of the following statement if num1=10, num2= 5:
(num1++ | num2)&((++num2)^num1)
and also write the precedence of the operators you came across till now(on paper or notebook or
text file).



*/



class Precedentss{

	public static void main(String[] args) {
		
		int num1=10;
		int num2=5;

		int ans=0;

		ans=(num1++ | num2)&((++num2)^num1);

		System.out.println("The ans of Expression is"+ans);//
		System.out.println("The num1 of Expression is"+num1);
		System.out.println("The num2 of Expression is"+num2);


	}
}