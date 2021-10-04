/*

	find out all elements from array whoes occurance is > N/3
	e.g : [1,2,1] ==> list has 3  elements
				  ==> n/3 = 3/3 = 1
				  ==> any element whoes count > 1 is to be printed
				  ==> output = 1

		  [1,1,3,1,2,2,3,2] ===> 1 and 2 to be printed...

		  *********** jevde divide by no tevde no -1

		  eg :- ikde /3 ae so 2 var use kartoy ........ ma /2 hot so 1 var use kel

*/
class MajorElement{

	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,2,2,5,5,3,3,3};

		int num1 = -1;
		int num2 = -1;
		int c1 = 0 , c2 = 0 ;

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			if(c1 == 0){
				num1 = arr[i];
				c1 = 1;
			}
			if(c2 == 0){
				num2 = arr[i];
				c2 = 1;
			}else if(num1 == arr[i]){
				num1 = arr[i];
				c1++;
			}else if(num2 == arr[i]){

				num2 = arr[i];
				c2++;
			}else{

				c1--;c2--;
			}
		}

		System.out.println(" number 1 = " + num1);
		System.out.println(" number 2 = " + num2);
	}
}