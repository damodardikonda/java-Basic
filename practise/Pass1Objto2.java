class BCCI{

	String presName = "Saurabh Ganguly";
	int year = 2 ;
	
	BCCI(){

		System.out.println(presName);
	}

}

class IPL {

	IPL(){

		System.out.println("In IPL");
	}

	IPL(BCCI b){

		System.out.println(" President is = " + b.presName);
		System.out.println("Year of President is = " + b.year);
	}

}

class Match{

	public static void main(String[] args) {
		
		BCCI o = new BCCI();
		IPL i = new IPL(o);

	}
}
