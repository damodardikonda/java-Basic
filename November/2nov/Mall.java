class Brand{

      String brand_name = " Zara";
      int shopno = 21;

      void cloth(){

      	System.out.println(" t-Shirt are available ");
      	System.out.println("trousers are Available");
      	System.out.println("Shirts are available");
      }

}


class Mall{

	String mallname = " Seasons";
	int shop = 27;
        
        Brand zara = new Brand();
	void mallInfo(){

            System.out.println("Food / Cloth /Games /theater");
            System.out.println(" Mall Name is = " + mallname);
            System.out.println(" Number of shops are" + shop);
            
            available_Product();
                
	}

      void available_Product(){

      	System.out.println("Product Available are =  ");
      	zara.cloth();
      }

}


class Customer{

	public static void main(String[] args) {
		
		Mall season = new Mall();
		season.mallInfo();
	}
}