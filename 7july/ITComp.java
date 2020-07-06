class Capgemini{

	static int no_of_emp=200000;
	int project_no=200;

	void display_Project(){

		System.out.println("Capgemini Project:- "+project_no);
	}

    static void display_No_Of_Emp(){
         System.out.println("Capgemini number of employees are:- "+no_of_emp);
    }

}

class TCS{

	static int no_of_emp=300000;
	int project_no=300;

	void display_Project(){

		System.out.println("TCS Project :-"+project_no);
	}

    static void display_No_Of_Emp(){
         System.out.println("TCS number of employees are:-"+no_of_emp);
    }
    
}

class ITComp{
	public static void main(String args[]){

		Capgemini pune=new Capgemini();
		pune.project_no=130;
		pune.display_Project();
        pune.display_No_Of_Emp();

        Capgemini chennai=new Capgemini();
		chennai.project_no=70;
		chennai.display_Project();
        chennai.display_No_Of_Emp();



        TCS mumbai=new TCS();
		mumbai.project_no=230;
		mumbai.display_Project();
        mumbai.display_No_Of_Emp();

        TCS banglore=new TCS();
		banglore.project_no=270;
		banglore.display_Project();
        banglore.display_No_Of_Emp();
	}
}