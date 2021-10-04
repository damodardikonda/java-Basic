class Str_Que{

	public static void main(String[] args) {
		
		String s1 = new String("Damodar");
		String s2 =  new String("Dikonda");

		String s3 = s1.concat(s2);
           
          s3 = s3.intern();
		System.out.println(s3);
	}
}