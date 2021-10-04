class Str_Without_Split{

	public static void main(String[] args) {
		
		String str = " Raja Software Lab ";
		 str = str.trim();
		int space = 0;
		for ( int i = 0 ; i < str.length() ; i++ ) {
			
			if(str.charAt(i) == ' ')
				space++;
		}

		String arr[] = new String[space+1];

		String tempstr = "";

		for (int j = 0, k = 0  ; j < str.length() ; j++ ) {
			
			if(str.charAt(j) == ' '){

				arr[k] = tempstr;
				k++;
				tempstr = "";
			}else{

				tempstr = tempstr + str.charAt(j);
			}
			arr[k] = tempstr;
		}

		for (int i = arr.length-1 ; i >=0; i-- ) {
			
			System.out.println(arr[i]);
		}
	}
}