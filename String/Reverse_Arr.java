class Rever_Array{
	
	public static void main(String[] args) {
		
		String s = " Hii Damodar";

		char ch [] = s.toCharArray();
      String rev = " ";
		for (int i = ch.length-1 ; i >= 0 ; i-- ) {
			
               rev+=ch[i];
		}

		System.out.println(rev);
	}
}