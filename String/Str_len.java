class Str_len{

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer(" Hii My Name Is Damodar Dikonda");

      int len = str.length();

		
		str.append(" Did You Understand");

       	
       	 len = str.length();
        System.out.println(" The Length of String is " + len);


	}
}