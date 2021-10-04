class CubePattern{

	public static void main(String[] args) {
		
		int num = 1;

		for (int i = 0 ; i < 5 ; i++) {
			
			for (int j = 1 ; j <= i; j++ ) {
				
				int cube = num *num*num;

				System.out.print(cube + " ");
				num++;
			}

			System.out.println();
		}
	}
}