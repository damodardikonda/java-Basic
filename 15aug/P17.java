/*

Write a program to check whether the number is prime number or not
(Take hardcoded Value)

*/

class P17{

	public static void main(String[] args) {
		
		int num = 7;
		int temp = num;
		int count = 0;

		for(int i = num ; i >= 1 ; i--){
          
          if(temp % i == 0)
			count = count+1;
		}

		if(count == 2){

			System.out.println(temp + " is an Prime Number ");
		}
	}
}