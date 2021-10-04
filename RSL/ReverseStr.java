class ReverseStr {

	public static void main(String[] args) {
		
		String s = "i.like.this.program.very.much";


String x = "";

String str[] = s.split("\\.");

for (int i = 0 ; i < str.length ; i++ ) {
	
	String word = str[i];

	String reverse = "";

	for (int j = word.length()-1 ; j >= 0 ; j--) {
		
		reverse = reverse + word.charAt(j);

	}
	System.out.print(reverse+".");
	
}


}
}