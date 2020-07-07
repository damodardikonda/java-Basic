class Ganga{
	
	static int No_Of_Plastic_Waste=300; // in tonn
	int length=2704; //km

	void dispLength(){
		System.out.println("The lenth of Ganga River in KM is = "+length);
	}


	void disp_Plastic_Wastage(){
		System.out.println("The Number of Plastic Wastage in Ganga River is = "+No_Of_Plastic_Waste);
	}
}


class Bhima{
	
	static int No_Of_Plastic_Waste=200; // in tonn
	int length=861; //km

	void dispLength(){
		System.out.println("The lenth of Bhima River in KM is = "+length);
	}


	void disp_Plastic_Wastage(){
		System.out.println("The Number of Plastic Wastage in Bhima River is = "+No_Of_Plastic_Waste);
	}
}


class River{

       public static void main(String[] args) {
		
		Ganga varanasi=new Ganga();
		varanasi.length=200;//km
		varanasi.dispLength();
		varanasi.disp_Plastic_Wastage();


		Ganga haridwar=new Ganga();
		haridwar.length=160;//km
		haridwar.dispLength();
		haridwar.disp_Plastic_Wastage();
      
        Bhima pune=new Bhima();
		pune.length=120;//km
		pune.dispLength();
		pune.disp_Plastic_Wastage();

        
        Bhima beed=new Bhima();
		beed.length=80;//km
		beed.dispLength();
		beed.disp_Plastic_Wastage();


	}
}

