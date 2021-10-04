import java.util.*;
class Politics{
	
		String name = null;
		int year = 0;
		String party = null;

		Politics( String name , int year , String party){

			this.name = name ;
			this.year = year;
			this.party = party;
		}

		void print_politician(){

			System.out.println(name + " " + party + " " + year);
		}
}

class SortByName implements Comparator<Politics>{

	public int compare(Politics p1 , Politics p2){

		return p1.name.compareTo(p2.name);
	}
}

class ComparatorDemo{

	public static void main(String[] args) {
		
		ArrayList<Politics> al = new ArrayList<Politics>();

		al.add( new Politics("Sharad Pawar " , 60 , "NCP"));
		al.add( new Politics("  Narayan Rane " , 30 , "BJP"));
		al.add( new Politics(" Uddhav Thakre " , 42 , " Shivsena"));
		al.add( new Politics(" Ashok Chavan " , 49 , "Congress"));

		Collections.sort(al , new SortByName());

		for(Politics p : al){

			p.print_politician();
		}
	}
}