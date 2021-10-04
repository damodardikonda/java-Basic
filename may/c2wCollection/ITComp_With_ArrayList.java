import java.util.*;

class ITCompany{

	String compName = null;
	int emp = 0;

	ITCompany(String compName , int emp){

		this.compName = compName;
		this.emp =  emp;
	}

	void disp(){

		System.out.println(" Company name = " + compName + " and 	Employees are " + emp);
	}
}
class ArrDemo{

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add(new ITCompany(" Bitwise" , 250));
		al.add(new ITCompany("Apple" , 25000));
		al.add( new ITCompany("Microsoft " , 250000));

		ListIterator itr = al.listIterator();
		while(itr.hasNext()){

			ITCompany obj = (ITCompany) itr.next();
			obj.disp();

		}
	}
}