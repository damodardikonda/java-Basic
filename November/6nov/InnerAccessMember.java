class Outer{

	int a = 10;

	class Inner{

		int a = 20 ;

		void m1(){

			int a = 30;

			System.out.println(a) ; // 30
			System.out.println(this.a) ; // 20
			System.out.println(Outer.this.a) ; // 10
		}
	}

	public static void main(String[] args) {
		
		Outer o = new Outer();

		Inner i = o.new Inner();
		i.m1();
	}
}