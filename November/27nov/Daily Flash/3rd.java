// Yes we can call base class function from derived class object

class Base{

	void m1(){

		System.out.println(" Base class method");
	}

}

class Derived extends Base{

	void m1(){
         super.m1();
		System.out.println(" Derived Method");
	}
}

class Child{

	public static void main(String[] args) {
		
		Derived d = new Derived();
		d.m1();
	}
}