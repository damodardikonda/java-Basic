class Building{

    String materialName;
    double price;
    double totalprice = 0.00;

	Building(String materialName, double price){

		this.materialName = materialName;
		this.price = price;
	}

     
	double materialPrice(){

           totalprice = totalprice + price;
        return totalprice;
	}


	public static void main(String[] args) {
		
		Building iron =  new Building("iron rod" , 8900.300);
		Building cement = new Building("Cement " , 34.800);
		Building bricks = new Building("Bricks" , 7800.200);
	

	    double ir = iron.materialPrice();  
	    double ce = cement.materialPrice();
	    double br = bricks.materialPrice();

	    double total =ir+ce+br;
	    System.out.println("Total cost is = " + total);

		

	}

}