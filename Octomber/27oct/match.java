class ICC{

  ICC(){

    System.out.println("ICC Constructor");
  }
}
class BCCI extends ICC{

     public BCCI(){

           System.out.println("BCCI Constructor");
      }

}


class IPL extends BCCI{

	IPL(){

       System.out.println("IPL Cnstructor");
	}
}


public class match{

	public static void main(String[] args) {
		
       BCCI obj = new BCCI();
       IPL ipl20 = new IPL();
	}
}