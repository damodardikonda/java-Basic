class NearPrime{

	public static void main(String[] args) {
		
		int prime = 50;

		int flag = 0;
		for (int i = prime -1 ; i >= 2  ; i--) {
			
			for (int j = 1 ;j <= i ; j++ ) {
				
				if(i % j == 0)
						
					flag++;
			}

			if(flag == 2){
				System.out.println(i);
				break;
			}

		}
	}
}
