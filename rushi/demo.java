
class Niku{

	public static void main(String[] args) {
		int num = 0; 
		String str = "";
		
		String s ="nrszh";
		for (int i = 0 ; i < str.length() ; i++ ) {
			char c = str.charAt(i);
			if(c =='x')
				c = 'a';
			else if(c == 'y')
				c = 'b';
			else if(c == 'z')
				c= 'c';
			else{

				c+=3;
				s+=c;
			}
		}

		System.out.println(s);
	}
}