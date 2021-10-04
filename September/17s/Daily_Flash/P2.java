class P2{
	
	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 5 ; i++ ) {
			int temp = i;
			for (int j = 1 ; j <= 5 ; j++ ) {
				
				if(temp >= 6){
					temp = 1;
					System.out.print(temp  + " " );
				}
				else{
				System.out.print( temp +" ");
				temp++;
			}
			}

			System.out.println();
		}
	}
}