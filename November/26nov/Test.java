class Test{

	void m1( String s){
        
         System.out.println(" String class");
	}

	void m1( StringBuffer s2 ){

		System.out.println(" StringBuffer class");
	}
}

class Test1{

	public static void main(String[] args) {
		
		Test t = new Test();
		t.m1(" Damodar");
		t.m1(new StringBuffer("Dikonda"));

		// t.m1(null);
	}
}