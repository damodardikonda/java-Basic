class StringTest{

	public static void main(String[] args) {
		
		String s1 = "Damodar"; // SCP
		String s2 = new String("Damodar"); //Heap with reference and SCP without reference
		String s3 = "Damodar"; // SCP
		String s4 = new String("Damodar"); //Heap with reference and SCP without reference


		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println(s1 == s2 );
		System.out.println( s2 == s3 );
		System.out.println(s1 == s3 ); 
	}
}