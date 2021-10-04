class Parent1{

	Parent1(){
           
		System.out.println(" Parent Class Constructor");
	}
}

class Child1 extends Parent1{

    Child1(){

    	System.out.println(" Child class Constructor");
    }

    public static void main(String[] args) {
    	
    	Child1 c = new Child1();

    }
}