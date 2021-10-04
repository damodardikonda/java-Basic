class StringTest1{

	public static void main(String[] args) {
		
		String s1 = "Damodar";
		String s2 = new String("Damodar");

		String s3 = "Damodar";
		String s4 = new String("Damodar");

		System.out.println(s1 == s2); // False
		System.out.println(s1 == s3);//True
		System.out.println(s1 == s4); //False
		System.out.println( s2 == s4);//false
	}
}