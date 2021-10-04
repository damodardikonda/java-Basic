class Outer{

	void m1(){

		System.out.println(" m1 ");
	}

	interface Inner{

		void m2();
	}
}


class XYZ extends Outer implements Outer.Inner{

	public void m1(){

		System.out.println(" In m1 method ");
	}

	public void m2(){

		System.out.println(" In m2 method");
	}
}

class Test6{

	public static void main(String[] args) {
		
		Outer o = new XYZ();
		o.m1();

		Outer.Inner inn = new XYZ();
		inn.m2();

		XYZ obj = new XYZ();
		obj.m1();
		obj.m2();
	}
}