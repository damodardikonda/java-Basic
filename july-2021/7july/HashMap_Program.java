import java.util.*;

class Company{

	String compName ;
	double sal;

	Company(String compName , double sal){

		this.compName = compName;
		this.sal = sal;
	}

	public String toString(){

		 String s = "(" + compName + " " + sal + ")";
		return s;
	}
}

class Friends{

	public static void main(String[] args) {
		
		HashMap<String , Company> hs = new HashMap();

		hs.put("Damodar" , new Company("Persistent" , 450000));
		hs.put("Manthan" , new Company("Persistent " , 450000));
		hs.put("Dhiraj" , new Company("Persistent" , 450000));
		hs.put("JD" , new Company("Persistent " , 450000));

		System.out.println(hs);
	}
}