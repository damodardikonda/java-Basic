/*
write a program to check whether the number is perfect number or not
Hint: (positive integer that is equal to the sum of its proper divisors)
e.g i/p : take hardcoded value
o/p : 6 is a prefect number
*/

class P6{
	
	public static void main(String[] args) {
		
		int num = 6;
		int sum = 1;

		for (int i = 2 ; i < num ; i++ ) {
			
			if(num%i==0){

				sum = sum + i;
			}
		}
       if(num == sum){

       	    		System.out.println(num + " is perfect Number");

       }
       else
		System.out.println(num + " is not perfect number ");
	}
}