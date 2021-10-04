class P4{
	
	public static void main(String[] args) {
		

		int var = 7;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= 
				i; j++) {
				if(j > 0)
					var--;
				System.out.print(var + " ");
			}
			System.out.println();
		}



	}
}