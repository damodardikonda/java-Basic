class ICC{

	ICC(){

		System.out.println("ICC Constructor");
	}
}

class BCCI extends ICC{

	BCCI(){

		System.out.println("BCCI Constructor");
	}
}

class IPL extends BCCI{

	IPL(){

		System.out.println(" IPL Constructor");

	}
}

class Match{

	public static void main(String[] args) {
		
		IPL ipl2020 = new IPL();
	}
}