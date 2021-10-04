class Intern_Meth{

	public static void main(String[] args) {
		
		String s1 = "Damodar";
		String s2 = new String("Damodar");

		System.out.println(s1==s2);//false

		s2=s2.intern();

		System.out.println(s1 == s2);//true
	}
}