/*

        1
      3 2 1
    5 4 3 2 1
  7 6 5 4 3 2 1
9 8 7 6 5 4 3 2 1


*/

class P40{

	public static void main(String[] args) {
		
		int num = 1, k = 0 ,  temp = 0 ;
         temp = num;
		for(int i = 1  ; i <= 5 ; i++ , k = 0 ){

			for (int j = 1 ; j <= 5-i ; j++ ) {
				
				System.out.print(" ");
			}
             num = temp;
			while( k != 2 * i -1 ){
            
            System.out.print(num + " ");
           
            k++;
             num--;
			}
			temp = temp + 2; 
			System.out.println();
		}
	}
}