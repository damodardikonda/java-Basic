abstract class Burger{

     Burger(){

     	System.out.println(" Burger.............");
     }
   
     void test(){

     	  System.out.println(" Burger changla lagto");
     }

     abstract void quantity();
     abstract void price();
}


class CampBurger extends Burger{

     CampBurger(){

     	System.out.println(" Burger in camp");
     }
     void quantity(){

     	System.out.println(" jast");

     }

     void price(){

     	System.out.println("Price is Average");
     }


}


class MacD extends Burger{

    MacD(){

    	System.out.println(" Macdownold Burger.......");
    }
	void quantity(){

		System.out.println(" Ekdam ch kami");
	}

	void price(){

		System.out.println(" Khupach jast");
	}
}


class Fatty{

	public static void main(String[] args) {
		
		Burger b = new CampBurger();
        b.test();	
		b.quantity();
		b.price();

		Burger b2 = new MacD();
		b2.test();
		b2.quantity();
		b2.price();
	}
}