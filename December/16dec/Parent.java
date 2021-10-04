class Parent{

	static void m1(){

		System.out.println(" m1 - Parent");
	}
}

class Child extends Parent{

	static void m1(){

		System.out.println(" m1 - Child");
	}
}

class Test2{

	public static void main(String[] args) {
		
		Parent a = new Child();

	}
}