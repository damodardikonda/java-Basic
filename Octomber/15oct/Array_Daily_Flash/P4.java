class P4{

	public static void main(String[] args) {
		
		String s[] = {"I" ,"Am" ,"Indian"};

        for (int i = 0 ; i < s.length ; i++ ) {
        	
        	for (int j = 0 ; j <= i ; j++ ) {
        		
        		System.out.print(s[i] + " ") ;
        	}

        	System.out.println();
        }
	}
}