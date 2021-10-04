class BCCI{

     public BCCI(){

           System.out.println("BCCI Constructor");
      }

}


class IPL extends BCCI{

	IPL(){

       System.out.println("IPL Cnstructor");
	}
}


class match{

	public static void main(String[] args) {
		
       BCCI obj = new BCCI();
       IPL ipl20 = new IPL();
	}
}