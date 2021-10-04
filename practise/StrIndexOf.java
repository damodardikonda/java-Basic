class StrIndexOf{

	public static void main(String[] args) {
		
		String s1 = "Bielearn";

		System.out.println(s1.indexOf('l'));

		System.out.println(s1.indexOf('e',3));

		int s2 = s1.indexOf('e');
		System.out.println(s2);

		System.out.println(s1.indexOf("learn" , 3));

		System.out.println(s1.indexOf("ear" , 2));



        System.out.println(s1.indexOf('l'));
        System.out.println(s1.lastIndexOf('l'));

        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,6));


        String s4 = "biencaps";
        String s5 = new String("CORE2WEB");

        System.out.println(s4.toUpperCase());
        System.out.println(s5.toLowerCase());


        String ss = "                 My Name is Damodar and I am a coder                           ";
        System.out.println(ss.trim());
        System.out.println(ss);
	}
}