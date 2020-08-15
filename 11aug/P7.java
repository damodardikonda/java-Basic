/*

Pattern8
E E E E E
D D D D D
C C C C C
B B B B B
A A A A A

*/


class P7{

	public static void main(String[] args) {
		
		int abc = 69;
		for(int i = 1 ; i <= 5 ; i++){

			for(int j =5 ; j >= 1 ; j--){


				System.out.print((char) abc + " ");

               
			}
			abc--;
			System.out.println();
		}
	}
}