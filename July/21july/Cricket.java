class Cricket{

	public static void main(String args[]){

		Cricket t20 = new Cricket();
		Cricket test = new Cricket();
		Cricket one_day = new Cricket();
		Cricket thirty=null;

		boolean ans=t20 instanceof Cricket;
		System.out.println("T2o is an Instance of Cricket or not :" + ans);  

		boolean ans1=one_day instanceof Cricket;
		System.out.println("one_day is an Instance of Cricket or not :" + ans1);  

		boolean ans2=test instanceof Cricket;
		System.out.println("TEST is an Instance of Cricket or not : " + ans2);
        
        boolean ans3=thirty instanceof Cricket;
		System.out.println("T2o is an Instance of Cricket or not :" + ans3);  

		boolean ans4=one_day instanceof Object;
		System.out.println("one_day is an Instance of Object or not :" + ans4);  

	}
}