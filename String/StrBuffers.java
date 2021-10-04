class Str_Bui{
	
	public static String Sbuffer(String str){

		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		return sb.toString();
	}

}


class StrBuffers{

	public static void main(String[] args) {
		
		
		

		System.out.println(Str_Bui.Sbuffer(" This is a String"));	}
}