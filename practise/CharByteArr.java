class CharByteArr{

	public static void main(String[] args) {
		
		char []a = {'D','A','M','S'};
		String s1 = new String(a);

        byte b[] = {100,101,102,105,108,103};
        String s2 = new String(b);

        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s2);
        System.out.println(s2.length());

	}
}