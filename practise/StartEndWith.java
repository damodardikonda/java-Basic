class StartEndWith{

	public static void main(String[] args) {
		
		String s1 = "Damodar";
		String s2 = new String("Dikonda");
		String s3 = "   Dikonda  ";
		String s4 = new String("   Hiii     ");

		System.out.println(s1.startsWith("Damo"));
		System.out.println(s2.startsWith("Diko"));
		System.out.println(s3.startsWith(" Diko"));
 		System.out.println(s4.startsWith("Hiii"));


 		System.out.println(s1.endsWith("dar"));

 		System.out.println(s2.endsWith("dd"));

 		System.out.println(s3.endsWith("dar "));

 		System.out.println(s4.endsWith("  i     "));

 		boolean b1 = s1.startsWith("Damo");
 		System.out.println(b1);

 		boolean b3 = s1.endsWith("dar");
 		System.out.println(b3);
	}
}