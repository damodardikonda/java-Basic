class BCCI{

	String pName = "Ganguly";
	int years = 2 ;

	BCCI(){

		System.out.println(" BCCI No argument Constructor");
	}

}


class IPL extends BCCI{


    IPL(){

    	System.out.println("IPL Constructor");
    }


    IPL(BCCI obj ){

    	System.out.println("Parameterised constructor");
     	System.out.println("President name = " + obj. pName);
        System.out.println("Year = " + obj.years);
    }


}


class match{

	public static void main(String[] args) {
		
		IPL obj = new IPL();
		IPL o = new IPL(new BCCI());
	}
}
