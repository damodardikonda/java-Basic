/*

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5


*/

class P10{

	public static void main(String[] args) {
		int num = 1;
		for(int i = 1 ; i <= 5 ; i++){

			for (int j = 1; j <= i ;j++ ) {
				
				System.out.print(num + " ");
			}
            num++;
			System.out.println();
		}
	}
}