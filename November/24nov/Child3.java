class Parent3{

   int x = 20;

	

	void m1(){

		System.out.println("Parents m1 ");
	}
}

class Child3 extends Parent3{

     int x = 10 ;
     
	void m1(){

        super.m1();
		System.out.println(" Child m1 ");
		System.out.println(x); // 10
		System.out.println(super.x); //20
	}

public static void main(String[] args) {

       Child3 c = new Child3();
       c.m1();	
}}