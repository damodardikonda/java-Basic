class P3{
	
	public static void main(String[] args) {
		
		String s1 = new String("Damodar"); // in heap with reference and in SCP without reference 

		String s2 = "Damodar"; // in string constant Pool with reference

        System.out.println(s1);
        System.out.println(s2);
	}
}