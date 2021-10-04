/*: Write a Program to print series of Even numbers ranging between
two numbers entered by user.
Input:
Min of Series : 4
Max of Series: 60
Output: Series Of Even Numbers Ranging between 4 & 60 is:
4, 6, 8, . . ., 60
*/

import java.util.Scanner;

class P1{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();

		int max = sc.nextInt();

		for (int i = min ; i <= max ; i++ ) {
			
			if( i % 2 ==0 ){

                System.out.print(i + " ");

			}
		}
	}
}