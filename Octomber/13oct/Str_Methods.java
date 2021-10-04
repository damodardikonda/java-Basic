class S_Meth{

	public static void main(String[] args) {
		
		String s1 = "Damodar";
        String s2 = new String("Damodar");
        String s3 = new String("Damodar");

        System.out.println(s1 == s2); // False
        System.out.println(s1 == s3); // False
        System.out.println(s2 == s3); // False

        System.out.println(s1.equals(s2)); // True
        System.out.println(s1.equals(s3)); // True
        System.out.println(s2.equals(s3)); // True

 
	}
}