class SingleTon{

	public String s ;

	public static SingleTon single = null;
	
	private SingleTon(){

		s = "This is private string of singleton class ";
	}

	public static SingleTon getInstance(){

		if(	single == null ){

			single = new SingleTon();
		}		
			return single;
	
	}
}

class Main{

	public static void main(String[] args) {
		
		SingleTon x = SingleTon.getInstance();

		SingleTon y = SingleTon.getInstance();

		SingleTon z = SingleTon.getInstance();

		x.s = (x.s).toUpperCase();


		System.out.println(" The string is after get called by x = " + x.s );
		System.out.println(" The string is after get called by y = " + y.s );
		System.out.println(" The string is after get called by z = " + z.s );


		z.s = (z.s).toLowerCase();

		System.out.println(" The string is after get called by x = " + x.s );
		System.out.println(" The string is after get called by y = " + y.s );
		System.out.println(" The string is after get called by z = " + z.s );

	}
}