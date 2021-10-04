class P3{
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("GoodLife");
		String s = new String("Good");
        String s1 = "Damodar";
		sb = sb.append(s);
        StringBuffer sb2 = new StringBuffer();
        sb2 = sb.append(s1);
		System.out.println(sb);
		System.out.println(sb2);
	}
}