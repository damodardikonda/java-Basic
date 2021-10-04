interface A{

	default void meth(){

		System.out.println(" Damodar ");
	}
}

class B {

	public static void main(String[] args) {
		
		A obj = new A(){ // B$1
 
			public void meth(){

				System.out.println("Dikonda");
			}
		};


		obj.meth();
	}
}