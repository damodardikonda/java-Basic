class Str_Buff_Str{

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Damodar");
		System.out.println(sb); // Damodar
		System.out.println(sb.capacity()); //16 + 7 = 23


		StringBuilder sb2 = new StringBuilder("Damodar");
		System.out.println(sb2); // Damodar
		System.out.println(sb2.capacity());

	}
}