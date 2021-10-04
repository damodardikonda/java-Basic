/*class Outer{

	int a = 10;

	class Inner{

		int a = 20;

		class Inner2{

			int a = 30;

			void m1(){
				int a= 40;
				System.out.println(a);//40
				System.out.println(this.a); // 30
				System.out.println(Inner.this.a);//20
				System.out.println(Outer.this.a);
			}
		}
	}

	public static void main(String[] args) {
		
		new Outer().new Inner().new Inner2().m1();
	}
}
*/

class Outer{

	class Nested{


	}

	public static void main(String[] args) {
			
			Outer o = null;
			Nested i = o.new Nested();
	}
}