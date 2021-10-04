class IndianFestival{
	
	void festival(){

		System.out.println("India has many religions ");
	}
}
	 class Dipawali extends IndianFestival{

         int days = 5 ;

         void diwaliFest(){

         	System.out.println(" Dipawali Festival");
         	System.out.println("In dipawali days are = " + this.days);
         }
	 }

	 class Ramazan extends IndianFestival{

	 	String main = "Ramazan eid";

	 	void ramazanFest(){

	 		System.out.println("Ramazan fest");
	 		System.out.println("main festival is " + this.main);
	 	}
	 }

	 class ChhatPooja extends IndianFestival{

	 	 int hours = 48 ;

	 	 void ChhatPoojaFest(){

	 	 	System.out.println(" Chhatpooja has " + this.hours + " Pooja");
	 	 }
	 }
	

class Festivals{
	public static void main(String[] args) {
		
		IndianFestival if = new IndianFestival();
		if.festival();

		Dipawali d = new Dipawali();
		d.diwaliFest();

        Ramazan r = new Ramazan();
        r.ramazanFest();

        ChhatPooja cp = new ChhatPooja();
        cp.ChhatPoojaFest(); 
	}
}