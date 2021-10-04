class aaa3a{

		
	public static void main(String[] args) {
		
		String str = "aabcccccaaa";
		StringBuffer sb = new StringBuffer("");
		int count = 1;
		
			char x = str.charAt(0);
			
			for (int j = 1 ; j < str.length() ; j++ ) {
			
				char k = str.charAt(j);
				if( x == k){

					count++;
				}else{
					if(count > 0 ){
					sb.append(x).append(count);
					count = 1 ;
					x = str.charAt(j);
				}
				}
			}		
			
			if(count > 0)
				sb.append(x).append(count);
			else
				sb.append(x);

		System.out.println(sb);

	}
}