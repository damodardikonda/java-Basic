import java.util.*;

class Politicians{

	String name = null;
	int year =  0;
	String party = null;

	Politicians( String name , int year , String party){

		this.name = name;
		this.year = year;
		this.party =  party;
	}

	void disp_politicians_info(){

		System.out.println(name + " " + year + " ");
	}
}
/*
class SortByYear implements Comparator<Politicians>{

	public int compareo(Politicians p1 , Politicians p2){

		// For print in ascending order 
		//return p1.year - p2.year
		// For print in descending order
		return p2.year - p1.year;
	}
}
*/
class Comparations{

	public static void main(String[] args) {
		
		ArrayList<Politicians> al = new ArrayList<Politicians>();

		al.add(new Politicians("Sharad pawar" , 60 , "NCP"));
		al.add( new Politicians(" Uddhav Thakare" , 34 , "Shiv Sena "));
		al.add( new Politicians("Nitin Gadkari " , 40 , "BJP"));
		al.add( new Politicians("Ashok Chavan " , 45 , "Congress"));

		Comparator<Politicians> SortByYear =  new Comparator<Politicians>(){
		public int compare(Politicians p1 , Politicians p2 ){
			return p2.year - p1.year;
		}
		};

		Collections.sort(al , SortByYear);

		for(Politicians p : al)
			p.disp_politicians_info();
	}
}