class FreqVowels{

	public static void main(String[] args) {
		
		String  str = "aaaeeiiiiouu";

		int count[] = new int[5];

		for (int i= 0; i < str.length() ; i++ ) {
			
			if(str.charAt(i) == 'a' || str.charAt(i) == 'A')
				count[0]++;

			if(str.charAt(i) == 'e' || str.charAt(i) == 'E')
				count[1]++;

			if(str.charAt(i) == 'i' || str.charAt(i) == 'I')
				count[2]++;

			if(str.charAt(i) == 'o' || str.charAt(i) == 'O')
				count[3]++;

			if(str.charAt(i) == 'u' || str.charAt(i) == 'U')
				count[4]++;
		}

		System.out.println(" a= " + count[0]);
		System.out.println(" b= " + count[1]);	
		System.out.println(" c= " + count[2]);	
		System.out.println(" d= " + count[3]);
		System.out.println(" e= " + count[4]);
	}
}