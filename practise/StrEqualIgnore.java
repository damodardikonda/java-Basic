class StrEqualIgnoreCase{

	public static void main(String[] args) {
		
		String s1 = "Damodar";
		String s2 = "DAMODAR";
		String s3 = "Damodar";
		System.out.println(s1.equalsIgnoreCase(s2));


		System.out.println(s1.compareTo(s3));
	}
}