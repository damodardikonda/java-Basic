class Corona_MH{
	
	int count=170000;

	void Precaution(){
	     System.out.println("count is :-"+count);
	     System.out.println("Stay Home Stay Safe");
	}

	static void impDecision(){
	     System.out.println("CM Decision");
	}


     public static void main(String[] args){

          Corona_MH jun28 = new Corona_MH();
          jun28.Precaution();
          jun28.impDecision();


          Corona_MH jun29 = new Corona_MH();
          jun29.count=175000;
          jun29.Precaution();
          jun29.impDecision();
     }
}