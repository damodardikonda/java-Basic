class OuterTesting{

	int a = 10;

	class Inner {

		int a = 20;

		class Inner2{

			int a= 30;

			void m1(){

				int a = 40;

				System.out.println(a); // 40
				System.out.println(this.a); // 30 
				System.out.println(Inner.this.a); //20
				System.out.println(OuterTesting.this.a); // 10
			}
		}
	}


	public static void main(String[] args) {
		
		new OuterTesting().new Inner().new Inner2().m1();
	}
}