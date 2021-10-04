class Outer{

	int x = 10;

	class Inner{

		void display(){

			System.out.println("In Inner Class");
		}
	}
}

	
class InnerDemo{ 
	
	void DispDemo(){
		
		Outer o = new Outer();
		System.out.println("x = " + o.x );
		Outer.Inner i = o.new Inner();
		i.display();
	}

	public static void main(String[] args) {
		
		InnerDemo id = new InnerDemo();
		id.DispDemo();
	}
}