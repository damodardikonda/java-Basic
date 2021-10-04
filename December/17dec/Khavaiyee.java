abstract class Biryani{

   Biryani(){
   		System.out.println("Biryani");
   }
     void test(){

     	  System.out.println(" Biryani mhanje bharich");
     }

     abstract void quantity();
     abstract void price();
}


class PKBiryani extends Biryani{

 void test(){

     	  System.out.println(" Pkchi test bharich");
     }
     
     void quantity(){

     	System.out.println(" Average");

     }

     void price(){

     	System.out.println("Price is Average");
     }


}


class DorabjiBiryani extends Biryani{

	void quantity(){

		System.out.println(" Ekdam ch kami");
	}

	void price(){

		System.out.println(" Khupach jast");
	}
}


class Khavaiyee{

	public static void main(String[] args) {
		
		Biryani b = new PKBiryani();
        b.test();	
		b.quantity();
		b.price();

		Biryani b2 = new DorabjiBiryani();
		b2.test();
		b2.quantity();
		b2.price();
	}
}