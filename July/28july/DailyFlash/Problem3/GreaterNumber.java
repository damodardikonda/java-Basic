class GreaterNumber{

	public static void main(String args[]){

		int num1=40;
		int num2=70;
		int num3=30;



		if(num1 > num2 && num1 >num3 ){

			System.out.println(num1+" is greater");


		} else if(num2 > num1 && num2 >num3){

			System.out.println(num2+" is greater");


		} else if(num3 > num1 && num3 >num2){

			System.out.println(num3+" is greater");
	}

	System.out.println("Out of if-else");
}

}