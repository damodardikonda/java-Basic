class Google{
	
	Google(){

	     System.out.println(" Jyanna Coding yet nahi tyanna Posnare");
	}

	void working(){

	    System.out.println(" It has its own Search Engine");

	}
}

class GoogleMaps extends Google{

	GoogleMaps(){

        super();
		System.out.println(" Jyanna Rasta Mahit nahi tyanna vaat dakhvnara");
	}

   
   void working(){

   	   super.working();

   	   System.out.println(" Maps ");
   }
    
}

class Traffic extends GoogleMaps{

     Traffic(){

     	System.out.println(" Traffic Controlling");
     }

     void working(){

     	super.working();
     	System.out.println(" Shows the Traffic");
     }
}

class Passenger{

	public static void main(String[] args) {
		
		Traffic t = new Traffic();
		t.working();
	}
}