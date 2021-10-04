class Parent{

	Parent(){

		System.out.println(" Parent class Constructor");
	}
}

class Child extends Parent{

	Child(){

		System.out.println(" Child Class Constructor");
	}


	public static void main(String[] args) {
		
		Child c = new Child();
	}
}


/*

 Parent class Constructor
 Child Class Constructor

 prooved...
*/