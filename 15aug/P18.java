/*

18: Write a program to accept some number and print them in reverse order
Input: 420
Output: 024

*/

class P18{

	public static void main(String[] args) {
		
		int num = 420 ;
        int rem = 0;
        int rever = 0;
		while(num != 0){

			rem = num % 10;
            rever = rem ;

            System.out.print(rever);
            num = num /10;
		}
	}
}