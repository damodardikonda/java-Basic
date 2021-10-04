class P3{

    String name ;
    int age ;
	public P3(String name){
        this.name = name;
		System.out.println("Public  Constructor");
		System.out.println("Name is = " + this.name);
	}



	 P3( String sname , int age){
        this.age = age ;
        System.out.println("String name is = " + sname);
        System.out.println("Age is = " + age);
		System.out.println("Default  Constructor");
	}

	protected P3(int marks){
        System.out.println("Marks =" + marks);
		System.out.println("Protected Constructor");
	}

	private P3(){

		System.out.println("Private Constructor");
	}

       
      static void runs() {
     	
     	P3 obj = new P3();

     }

}


class subclass{

	public static void main(String[] args) {
		P3.runs();
		P3 obj2 = new P3("Damodar");
		P3 obj3 = new P3(390);
		P3 obj4 = new P3("Damu" , 21);
	}
}