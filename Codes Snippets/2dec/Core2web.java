class Core2web{
	
	String var;

	Core2web(CharSequence var){

		System.out.println(" Charsequence Constructor");
		this.var = ( String)var;
	}

	public static void main(String[] args) {
		
		Core2web c = new Core2web(" Shashi");

		System.out.println( c.var );
	}
}