class P12{
	
	public static void main(String[] args) {
		
		for (int i = 0 , j = 0 ; i <= 10 && j <= 10  ; ++i,--j ) {
			

			//System.out.printf("%2d %3d \n" , i , j);

			System.out.println(String.format(" %2d %3d" , i , j));
		}
	}
}