

class IfElseLadder{
	
	public static void main(String args[]){

		int x = -25;


		if(x >= 0 && x <= 10){

			System.out.println("Number is between 0 and 10");

		} else if(x >=11 && x <= 20){
          
          	System.out.println("Number is between 0 and 10");

		} else if(x >= 21 && x <= 30){

          	System.out.println("Number is between 0 and 10");

		} else if(x >= 31){

			System.out.println("Number is greater then 31");
		} else {

			System.out.println(" Negetive Number");
		}


	}
}