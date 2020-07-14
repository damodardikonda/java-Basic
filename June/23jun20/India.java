/*  Write a Real-Time Java Program that revolves around the current
venture by our Indian government to boycott Chinese products, declare static &
Instance Methods and Variables are call them from main method. Moreover, draw
the JVM architecture to that program as well.*/


class Chinese_App{

	static int total_apps_followers=70;//crores
	int tiktok_followers=25;//crores

	void dispTik(){

      System.out.println("Only for TikTokers...");
      System.out.println("Only tiktok followers are:="+tiktok_followers);

	}


  static void dispAll(){

  	System.out.println("For All Apps");
  	System.out.println("All Apps Followers are:-"+total_apps_followers);
  }
}


class India{

	public static void main(String args[]){

		Chinese_App boycott=new Chinese_App();
		boycott.dispTik();
		boycott.dispAll();


		Chinese_App dragun=new Chinese_App();
		dragun.tiktok_followers=22;
		dragun.dispTik();
		dragun.dispAll();


	}
}