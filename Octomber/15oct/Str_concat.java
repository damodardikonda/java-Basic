class Str_Concat{

	public static void main(String[] args) {
		
		String s1 = "Damodar";
		String s2 = "Dikonda";

		s1.concat(s2);

		System.out.println(s1); //Damodar
		System.out.println(s2); //Dikonda


		System.out.println(s1.concat(s2)); //DamodarDikonda
		System.out.println(s1);//Damodar
		System.out.println(s2);//Dikonda

		s1 = s1.concat(s2);
		System.out.println(s1);//DamodarDikonda
		System.out.println(s2);//Dikonda

	}
}