class cc{

	static(){

		this();
	}


	cc(){

		System.out.println(" -Zero -Arg");
	}

	cc( int var1){ 

         System.out.println(" one agr");
	 }

	 public static void main(String[] args) {
	 	
	 	cc c = new cc(10);
	 }
}