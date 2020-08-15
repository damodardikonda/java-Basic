/*

Write a Program in Java, Print the following pattern using for loop.

A B C D
E F G H
I J K L
M N O P

*/


class P19{
	public static void main(String[] args) {
		
	
int ch = 64;
int num = 1;
	for (int i = 1;i <= 4 ; i++ ) {
		
		for (int j = 1;j <= 4 ; j++) {
			
			System.out.print((char) (ch+num) + " ");

			num++;
		}

		System.out.println();
	}
}
}