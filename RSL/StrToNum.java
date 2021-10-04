class StrToNum{

	public static void main(String[] args) {
/*		
		String strNum = "12345";

		char ch[] = strNum.toCharArray();
		int x = 0;
		for (int i = 0 ; i < ch.length ; i++ ) {
			
			System.out.print(ch[i]);
		}
		System.out.println();
		int sum = 0;
		int val =0;
		int i = 0;
		while(i < strNum.length()){

			val =Character.getNumericValue(ch[i]);
			System.out.println(val);
			sum = (sum*10) + (val-x); 
			i++;
		} 


		System.out.println(sum);

*/

		System.out.println(" By using second way ");

		String strNum = "34567";
		char ch[] = strNum.toCharArray();
		int num =0;
		int zeroAscii = (int) '0';
		int i = 0 ; int tempAscii =0;
		while(i < ch.length){
			tempAscii =(int) ch[i];
			num = (num*10) + tempAscii - zeroAscii;
			i++;
		}

		System.out.println(num);
	}
}