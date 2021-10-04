class Lower_Upper{
	
	public static void main(String[] args) {
		
		String str = " DamoDarDikonDa";

		char ch [] = str.toCharArray();

		for (int i = 0 ; i < ch.length ; i++ ) {
		 	
		 	if(ch[i] >= 'a' && ch[i] <= 'z'){

		 		ch[i] = (char)((int) ch[i] + 32);
		 	}

		 	else if(ch[i] >= 'A' && ch[i] <= 'Z'){

		 		ch[i] = (char)((int) ch[i] - 32);
		 	
		 	}
		 }

		 for (int i = 0 ; i < ch.length ; i++ ) {
		  	
		  	 System.out.print(ch[i] + " ");
		  } 
	}
}