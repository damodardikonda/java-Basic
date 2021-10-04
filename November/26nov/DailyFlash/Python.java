class C{
	
	C(){

	    System.out.println(" Dennis Ritchy");
	}


	void lang(){

		System.out.println("Main Language");
	}
}

class Python extends C{

	Python(){

		super();

		System.out.println("Guido van Rossum");
	}

	void lang(){

		super.lang();

		System.out.println(" Internally Python works as C ");
	}

	public static void main(String[] args) {
        
        Python p = new Python();
        p.lang();		
	}
}