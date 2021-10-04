import java.util.*;
class ABP{

	private String reporter ;
	int report_channel ;




    
	ABP(){
          
          Scanner sc = new Scanner(System.in);

		System.out.println("Enter  reporter name");
	      reporter = sc.next();
       

		System.out.println("Enter  Report channel Count");
		report_channel = sc.nextInt();
	}

	void display(){

        
		System.out.println("Report channels are = " + report_channel);
		System.out.println("Reporter is = " + reporter);
	}

}

class Television{
    
    private int tv_channel;
	String Chanel ;
	int channel_count;

  
		

		ABP abp = new ABP();

	

    Television(){

    	Scanner sc = new Scanner(System.in);

       System.out.println("Enter  TV channel Count");
		 tv_channel = sc.nextInt();       

       System.out.println("Enter  Chanel name");
         Chanel = sc.next();

        System.out.println("Enter   channel Count");
		 channel_count = sc.nextInt();       

    }

	void displayABP(){
  
        ABP a = new ABP();
       a.display();

       System.out.println("Chanel name is = " + Chanel);
       System.out.println("Channel count is = " + channel_count);

	}

	void tvChannels(){

		System.out.println("Television has its " + tv_channel + " own TV Channels");
	}


}

class Person{

	public static void main(String[] args) {
		
       Television tv = new Television();
     
       tv.tvChannels();
       tv.displayABP();

	}
}