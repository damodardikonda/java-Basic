interface Yewale{

static void  waterBottole(){
     
     System.out.println("waterBottolesss");
}

default void CreamRoll(){

	System.out.println("CreamRolls");
}

	void makTea();
}



class PuneYewale implements Yewale{

	public void makTea(){ // Public specifier compulsory
 
          System.out.println("Mast Chaha");
	}

  /*public static void waterBottole(){
    System.out.println("zatttuuuuuuuuuuuuuuuuuu");
  }*/ //we can write but it wont override static metod
}



class PimpariYewale implements Yewale{

	public void makTea(){ // Public specifier compulsory
 
          System.out.println("Mast Chaha......");
	}
}


class Client{

	public static void main(String[] args) {

       Yewale y1 = new PuneYewale();
       y1.makTea();
      Yewale.waterBottole();

       Yewale y2 = new PimpariYewale();
       y2.makTea();		
       y2.CreamRoll();
	}
}