class Outer{

	int x = 10;

	class Inner{

		void display(){

			System.out.println("In Inner Class");
		}
	}

	void dispOuter(){

         Inner i = new Inner();
         i.display();


	}

	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.dispOuter(); 
	}
}