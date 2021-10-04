class StrBuffCapacity{

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer();
		System.out.println(str);
		System.out.println(str.capacity());

		str.append("Damodar");
		System.out.println(str);
		System.out.println(str.capacity());


		str.append("Bhaskar Dikonda");
 		System.out.println(str);
		System.out.println(str.capacity());

	}
}	