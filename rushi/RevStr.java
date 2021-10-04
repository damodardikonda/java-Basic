class RevStr{

	public static void main(String[] args) {
		
		String str = "Welcome to mettle";

		String str2[] =  str.split(" ");

		for(int i = str2.length-1 ; i >= 0 ; i--)
			System.out.print(str2[i] + " ");

	}
}