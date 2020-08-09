class RBI{
	

     static int rbi_collection = 100000;

     static void rbi_rep(){

         System.out.println("The total collecction of RBI is" + rbi_collection);
      }

}


class BOM extends RBI{

	static int bom_coll = 20000;

    static  void bom_rep(){

         System.out.println("The total collecction of BOM is" + bom_coll);
      }


}



class ICICI extends RBI{

	static int icici_coll = 10000;

    static  void icici_rep(){

         System.out.println("The total collecction of BOM is" + icici_coll);
      }


}




class Bank{


	public static void main(String[] args) {
		
		ICICI  ic = new ICICI();
		ic.icici_rep(); //10000
		ic.rbi_collection = ic.rbi_collection + ic.icici_coll; // 110000
		ic.rbi_rep(); //110000


		BOM  bo = new BOM();
		bo.bom_rep(); //20000
		bo.rbi_collection = bo.rbi_collection + bo.bom_coll; // 130000
		bo.rbi_rep(); //130000


	}
}