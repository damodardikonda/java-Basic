class StrConcat{

	public static void main(String[] args) {
		
		String s1 = "Damodar";
		String s2 = "Dikonda";

		String s3 = s1.concat(s2);
		/*System.out.println(s1);
		System.out.println(s2);

		s1 = s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2);

		String s3 = new String("BHaskar");
		String s4 = new String("Kisan");

		System.out.println(s3.concat(s2));

	*/

		System.out.println(s3);
		s3 =s3.intern();
		System.out.println(s3);
	}
}