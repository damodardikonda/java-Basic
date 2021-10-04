class Demo1{
	
	void m1( Object s1){
         
         System.out.println(" Object Method");
	}

	void m1( String s1){

		System.out.println( " String method");
	}
}

class Demo2{

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		d1.m1(null); // String method
	}
}