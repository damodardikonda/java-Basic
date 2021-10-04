class ProgramX{

	public static void main(String[] args) {
		
		String a = "aaabbbcc";
		int first = a.charAt(0);
		int res = 0 ;

		StringBuffer str = new StringBuffer("");
		for (int i = 0 ; i < a.length() ; i++ ) {
				
				if(first == a.charAt(i)){

					res++;
				}	
				else{
					if(res > 0){
					str.append((char)first).append(res);
					res = 1;
					first = a.charAt(i);
					}
				}
		}

		if(res > 0)
			str.append((char)first).append(res);
		else
			str.append(first);

		System.out.println(str);
	}
}