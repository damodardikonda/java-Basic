class Father{

	static void display(){

		System.out.println(" FDathers Display"); //printed
	}
}

class Son extends Father{

	static void display(){

		System.out.println(" Sons Display");
	}
}

class Call{

	public static void main(String[] args) {
		
		Father f = new Son();
		f.display();
	}
}