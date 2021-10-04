class ReverseString{
	
	public static void main(String[] args) {
		
		String str = "i.like.this.program.very.much";

		String arr[] = str.split("\\.");

		for (int i = arr.length-1; i >= 0 ; i-- ) {
			
				String word = arr[i];

				System.out.print(word + "_");
		}
	}
}