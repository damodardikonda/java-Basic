class Reverse_String{

	public static void main(String[] args) {
		
		String s = "Damodardikonda";

		int len = s.length();
		String rev = " " ;

		System.out.println(len);

           
           for (int i = len-1; i >= 0 ; i-- ) {
           	
           	rev = rev + s.charAt(i);
           }

           System.out.println(rev );
	}
}