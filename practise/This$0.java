class This0{

	class Inner{

		void m1(){
		
			System.out.println("In");
		}
	}

	public static void main(String[] args) {
		
		This0 o2 = new  This0();
		Inner i = o2.new Inner();
		i.m1();
	
		This0 o5 = new  This0();
		Inner i2 = o5.new Inner();
		i2.m1();
	
	}
}