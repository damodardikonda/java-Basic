interface Outer{
    int x = 20;
    
	void m1();

	interface Inner{

		void m2();
	}
}


class XYZ implements Outer , Outer.Inner{

	public void m1(){

		System.out.println(" In m1 method");
	}

	public void m2(){

		System.out.println(" In m2 method ");
	}
}

class Test5{

	public static void main(String[] args) {
		
		Outer o = new XYZ();
		o.m1();

		Outer.Inner inn = new XYZ();
		inn.m2();

		XYZ x = new XYZ();
		x.m1();
		x.m2();

	}
}