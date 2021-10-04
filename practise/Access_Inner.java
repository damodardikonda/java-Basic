class Outer{
	int x= 20;
	float g= 34.60f;
	class Inner{
		int x = 100;
		void disp(){
			int x = 200;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer.this.x);
			System.out.println(g);
			System.out.println("Hiii");
		}
	}

	void display(){

		Inner i = new Inner();
		i.disp();
	}
/*
	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.display();
	}
*/}


class OuterOuter{

		public static void main(String[] args) {
		
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.disp();
	}
}