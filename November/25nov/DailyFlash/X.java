class X{

	class y{

		static int a = 10; //  static comes before creation of object but here if we want to use static variable then we have to create an object so it is not allowed..
		static final int b = 20 ;

		void printVal(){

			System.out.println("A = " + a);
			System.out.println(" B = " + b);
		}
	}


	public static void main(String[] args) {
		
		X  x = new X();
		X.Y y1 = x.new Y();
		y1.printVal();
	}
}