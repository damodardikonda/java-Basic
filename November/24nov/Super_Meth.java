class Parent2{

	Parent2(){

		super();
		System.out.println("Parent Constructor ");
	}

	void m1(){

		System.out.println("Parents m1 ");
	}

	void m2(){

		System.out.println("Parents m2");
	}
}

class Child2 extends Parent2{

	Child2(){
         
		super();
		System.out.println("Child Class Constructor");


		
			}

void m1(){
		System.out.println(" Child m1 ");

        super.m2(); 
        super.m1();
			}

public static void main(String[] args) {

       Child2 c = new Child2();
       c.m1();	
}}