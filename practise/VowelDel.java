class VowelDel{

	public static void main(String[] args) {
		
		String s  = "This is a String";

		for (int i = 0 ; i < s.length()-1 ; i++ ) {
			
			char c = s.charAt(i);

			switch(c){

				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':

						s.charAt(i) = s.charAt(i+1);

		}
}
		s = s.trim();

		System.out.println(s);
	}
}