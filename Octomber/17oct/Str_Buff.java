class Str_Buff{

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();

		System.out.println(sb); // empty
		System.out.println(sb.capacity()); //16
  
        sb.append("Core2web"); 
        System.out.println(sb); // COre2Web
		System.out.println(sb.capacity()); //16


        sb.append("Shashi Sir"); 
        System.out.println(sb); // COre2WebShashi Sir
		System.out.println(sb.capacity()); //32

	}
}