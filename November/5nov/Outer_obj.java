class Outer{

    
        int x = 10 ;
	class Inner{
      

	 	void disp(){

			System.out.println("In Inner Class");
		}
	}


	public static void main(String[] args) {
		
		System.out.println(new Outer().x);

		Outer o = new Outer();
		System.out.println(o.x);

		Inner i = o.new Inner();
		i.disp();

		Inner ii = new Outer().new Inner();
		ii .disp();

		new Outer().new Inner().disp();
	}
}