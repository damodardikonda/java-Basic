class Outer{

	int x = 10;

	class Inner{

		void display(){

			System.out.println("In Inner Class");
		}
	}
}

	
class InnerDemo{ 
	public static void main(String[] args) {
		
		Outer o = new Outer();
		
		Outer.Inner i = o.new Inner();
		i.display();
	}
}