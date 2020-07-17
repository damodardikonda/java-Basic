/*Write a Real-Time Java Program that has three classes as Indian Army,
Indian Navy & Indian Air Force, declare static & Instance Methods and Variables are
call them from main method. Moreover, draw the JVM architecture to that program
as well.  */


class Indian_Army{

	static int no_of_rules=220;
	int wagha_rules=112;

	void disp_Wagha_Rules(){

		System.out.println("According to Wagha Border Rules count are:="+wagha_rules);
	}


	void disp_no_of_rules(){
		System.out.println("Total Rules are:="+no_of_rules);
	}
}



class Indian_Navy{

	static int no_of_ships=340;
	int base_ships=29;

	void disp_Base_Ships(){

		System.out.println("According to Main Base Ships count are:="+base_ships);
	}


	void disp_no_of_rules(){
		System.out.println("Total Ships are:="+no_of_ships);
	}
}





class Indian_Air_Force{

	static int no_of_pilots=8500;
	int b_pilot=600;

	void disp_Base_pilot(){

		System.out.println("According to Professionally trained pilots count are:="+b_pilot);
	}


	void disp_no_of_pilots(){
		System.out.println("Total pilots are:="+no_of_pilots);
	}
}



class Heroes{

	public static void main(String[] args) {
		
		Indian_Army b_king = new Indian_Army();
		b_king.wagha_rules=310;
		b_king.disp_Wagha_Rules();
		b_king.disp_no_of_rules();

        Indian_Air_Force flyingking =new Indian_Air_Force();
        flyingking.b_pilot=780;
        flyingking.disp_Base_pilot();
        flyingking.disp_no_of_pilots();


       Indian_Navy sea_king= new Indian_Navy();
       sea_king.base_ships=42;
       sea_king.disp_Base_Ships();
       sea_king.disp_no_of_rules();




	}
}