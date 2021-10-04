class StrReplace{

	public static void main(String[] args) {
		/*
		String str = "Damodar Bhaskar Dikonda";
		str = str.replace(" " , "%20");
		System.out.println(str);
*/
		StringBuffer sb = new StringBuffer("");
		String str = "Damodar Bhaskar Dikonda";

		int i = 0 ;

		while(i < str.length()){

			if(str.charAt(i) != ' '){

				sb.append(str.charAt(i));
			}else if(str.charAt(i) == ' '){

				sb.append("%20");
			}

			i++;
		}

		System.out.println(sb);
	}
}