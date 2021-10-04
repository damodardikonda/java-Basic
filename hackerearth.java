class HackEarth{
	
	static String strval;
	public static void main(String[] args) {
		
		HackEarth h1 = new HackEarth();
		strval = h1.getString("Program");
		System.out.println(""+strval);
	}

	public static String getString(String str){

		StringBuffer strbuf = new StringBuffer(str.length());

		for (int i = str.length()-1;i>0 ;i-- ) {
			
			strbuf.append(str.charAt(i));
		}

		return strbuf.toString();
	}
}