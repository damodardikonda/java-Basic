class Outer{

	int a = 10;

	class Inner1{

		int a = 20;

		class Inner2{

			int a = 30;

			class Inner3{

				int a = 40;

				void m1(){

					int a = 50;

					System.out.println(a); // 50
					System.out.println(this.a) ;//  40
					System.out.println(Inner2.this.a) ; //30
					System.out.println(Inner1.this.a) ; //20
					System.out.println(Outer.this.a);  //10
				}
			}
		}
	}


	public static void main(String[] args) {
		
		new Outer() . new Inner1().new Inner2().new Inner3().m1();
	}
}