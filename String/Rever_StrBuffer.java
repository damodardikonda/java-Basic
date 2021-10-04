class Str_Build{

	String Str_Rev( String s){

		StringBuilder ss = new StringBuilder(s);
		ss.reverse();

		return ss.toString();
	}
}

class Rever_StrBuffer{

	public static void main(String[] args) {
		
		String s = " Damodar Dikonda";

		Str_Build sb = new Str_Build();
		String rev = sb.Str_Rev(s);

		System.out.println(rev); 
	}
}