class Robot{

	public static void main(String[] args) {
		
		String str = "LLUUUDDDLLRRRRR";

		int c1 = 0 , c2 = 0 ;

		for (int i = 0 ; i < str.length() ; i++ ) {
			
			int x = str.charAt(i);

			if(x == 'U')
				c1++;
			else if(x == 'D')
				c1--;
			else if(x == 'L')
				c2++;
			else if( x == 'R')
				c2--;
		}

		if(c1==0 && c2 == 0)
			System.out.println(" At starting position ");
		else
			System.out.println(" Not in starting pos ");
	}
}