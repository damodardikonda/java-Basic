class String1{

	public static void main(String[] args) {
		

		String s1 = new String("Damodar Dikonda");

		System.out.println(s1);


       String s2 = "Damodar Dikonda";
		System.out.println(s2);

		

        
        StringBuffer str = new StringBuffer("Geeks for geeks");
        System.out.println(str);

        str.append(" heyyyyyyyyyyyy");
        System.out.println(str);


        StringBuilder s = new StringBuilder("OK they Fuck €yourself");
        System.out.println(s);
            
        s.append(" FUCK OFF!");
        System.out.println(s);

        char ch[] = { 'H' , 'E' ,'L' ,'L' ,'o'};

        String ss = new String(ch);
        System.out.println(ss);
	}
}