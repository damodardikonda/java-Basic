class Parent{
	
	void property(){

	       System.out.println(" Shet-Jamin");
	}

	void career(){

		System.out.println("Doctor");
	}
}

class Child extends Parent{

	void career(){

		System.out.println("Engineer");
	}
}

class Test{

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.career();

		Child c = new Child();
		c.career();

		Parent p1 = new Child();
		p1.career();
	}
}