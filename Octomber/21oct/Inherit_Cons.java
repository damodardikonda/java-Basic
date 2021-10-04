class BCCI{

    int x = 10;

    BCCI(){

    	System.out.println(" BCCI Constructor");
    }

}

class IPL extends BCCI{


      int runs = 2098;

      IPL(){

      	System.out.println("IPL Constructor");
      }


      void run(){

         System.out.println(" Runs are = " + runs);
      }
}

class Inherit_Conc{

	public static void main(String[] args) {
		
		IPL obj = new IPL();
		obj.run();
	}
}