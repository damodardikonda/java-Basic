class Instagram{

	void Disp_info(){

		System.out.println("Instagram has feed, profile ,chat ,stories,cloed friend, like sections");
	}
	
	static void check_Feed(Instagram feed ,  Instagram profile ) {
       boolean check;
	  check = feed instanceof Instagram;
	  System.out.println(check);

	  check = profile instanceof Instagram;
	  System.out.println(check);
	}

}


class Facebook{
	
   
   public static void main(String args[]){


         Instagram feed = new Instagram();

         Instagram story = new Instagram();

         Instagram profile=null ;

         Instagram.check_Feed(feed , profile);
   }


}