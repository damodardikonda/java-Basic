/* 


5 5 5 5 5
4 4 4 4
3 3 3
2 2 
1 

*/


class P20{
	
	public static void main(String[] args) {
		
		int num = 5;

		for(int i = 1 ; i <= 5 ; i++){

			for (int j = 5; j >= i  ; j-- ) {

				System.out.print(num+ " ");
				
			}

			num--;
			System.out.println();
		}
	}
}