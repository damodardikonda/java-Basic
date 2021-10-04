class Str_Cmp{

	public static void main(String[] args) {
		
		String s1 = "Damodar";
		String s2 = new String("Damodar");
		String s3 = "DAMODAR";
		String s6 =  "DAM";
		String s4 = "Core2Web" ;
		String s5 = new String("Core");


		//equals

		System.out.println( s1.equals(s2)); // True
		System.out.println( s1.equals(s3)); // False

		System.out.println( s1.equalsIgnoreCase(s3)); // True
		
		
		System.out.println(s1.compareTo(s2)); // 0
		System.out.println(s1.compareTo(s3)); // 32
		System.out.println(s1.compareTo(s4)); // 1
		System.out.println(s4.compareTo(s5)); // 4 
		System.out.println(s4.compareTo(s6));
		
	}
}