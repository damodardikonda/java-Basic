class Parent{

	Parent(){

		super();
		System.out.println("Parent Constructor ");
	}
}

class Child extends Parent{

	Child(){
         
		super();
		System.out.println("Child Class Constructor");
	}


public static void main(String[] args) {

       Child c = new Child();	
}}