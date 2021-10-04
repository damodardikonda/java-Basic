class IPL{

	IPL(){
		super();
	}

    String name = "KL Rahul";
	int runs20 = 567;
	static int totalruns = 10000;
    
    void disp(){

    	System.out.println("Runs in 2020 is " + runs20);
    	System.out.println("Name is = " + name);
    	System.out.println("Total Runs = " + totalruns);
    }

    static void disp2(){

    	System.out.println("Total Runs are = " + totalruns);
    }



    public static void main(String[] args) {
    	
    	IPL iplt20 = new IPL();
    	iplt20.disp();
    	IPL.disp2();

    	System.out.println(iplt20.runs20);
    }
}