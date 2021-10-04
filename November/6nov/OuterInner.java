class Outer{

	class Inner{

		void m1(){

			System.out.println("In m1 method");
		}
	}

	public static void main(String[] args) {
		
		Outer o1 = new Outer();
		Outer o2 = new Outer();

		Inner i = o1.new Inner();
	}
}