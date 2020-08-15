/*

tern35
        1
      2 2 2 
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5


*/

class P35{

	public static void main(String[] args) {
	int num = 1,k= 0 ;

	for(int i = 1 ; i <=5 ; i++,k=0){

		for (int j = 1; j <= 5-i ; j++ ) {
			
			System.out.print(" ");
		}

		

			while(k != 2 * i -1){
				System.out.print(num+ " ");
			k++;
			}

               num++;
               System.out.println();
		}
	
	}
}