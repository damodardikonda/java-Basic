class P{

	void m1(){

		System.out.println("Parent Class");
	}
}


class C extends P{

	void m2(){

		System.out.println("Child Class");
	}
}


class Test{

	public static void main(String args[]){

        
        P pobj = new C();
        pobj.m1();
       // pobj.m2(); error


	}
}