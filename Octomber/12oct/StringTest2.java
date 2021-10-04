class StringTest2{

	public static void main(String[] args) {
		
		String s1 = new String("Damodar");
		String s2 = "Damodar";
        
        
		System.out.println(s1 == s2);
    
		s1 = s1.intern();

		System.out.println(s1 == s2);
	}
}