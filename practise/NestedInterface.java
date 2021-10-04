interface Outer{
	int x =20;
	static int y=80;
	void m1();
	default void m2(){

		System.out.println("Inside m2 method");
	}

	interface Inner{

		void m3();
	}
}
class Testing implements Outer , Outer.Inner{

	public void m1(){

		System.out.println("M1 method");
	}
	public  void m3(){

		System.out.println("M3 method");
	}
}
class Test{
	public static void main(String[] args) {

 Outer o = new Testing();
 o.m2();
 o.m1();
		
Testing t = new Testing();
t.m1();
t.m2();
t.m3();
System.out.println("--------------------------------------------");
Outer.Inner oo = new Testing();
oo.m3();


System.out.println(Outer.x);
	
System.out.println(Outer.y);
	}
}