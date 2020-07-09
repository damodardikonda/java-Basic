class Core2web{

	static int totalStudCount=1200;
	int batchCount=0;

	void dispCount(){

		System.out.println("Total Student Count is="+totalStudCount);
		System.out.println("Total Batch Count is="+batchCount);

	}


}


class C2WAppAdmin{

	static int totalLoginCount=1200;
	int videoCount=0;

	void dispStat(){

		System.out.println("Total Student Login Count is="+totalLoginCount);
		System.out.println("Total Video Count is+"+videoCount);

	}

	
}


class Mentor{

	public static void main(String[] args) {

         Core2web java_10 = new Core2web();
       
         java_10.batchCount=370;
         java_10.dispCount();

         Core2web ppa5 = new Core2web();
       
         ppa5.batchCount=280;
         ppa5.dispCount();


         C2WAppAdmin python0 = new C2WAppAdmin();
       
         python0.videoCount=25;
         python0.dispStat();

         python0.totalLoginCount=1000;

         C2WAppAdmin os = new C2WAppAdmin();
       
         os.videoCount=125;
         os.dispStat();


		
	}
}