class Palin{

	public static void main(String[] args) {
		
		int b =121;
		Integer a = new Integer(b);

		String s = a.toString();

		String srev = "";

		int len = s.length();

		System.out.println(len);

		for (int i = len-1 ; i>=0  ; i-- ) {
			
			srev = srev + s.charAt(i);
		}

		if(s.equals(srev)){

			System.out.println("Palindrom");
		}else
			System.out.println(" Not Palindrom");
		
	}
}