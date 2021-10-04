import java.util.*;

class OlympicGold{

	int no_of_gold = 0;
	String country = null;

	OlympicGold(int no_of_gold , String country){

		this.no_of_gold = no_of_gold;
		this.country = country;
	}

	public String toString(){
		return "Country name is " + country + " gold = " + no_of_gold;
	}
}

class SortByGold implements Comparator<OlympicGold>{

	public int compare(OlympicGold ob1 , OlympicGold obj2){

		if (obj1. no_of_gold > obj2.no_of_gold )
			return 1 ;
		else if (obj1.no_of_gold < obj2.no_of_gold)
			return -1 ;
		else 
			return 0 ;
	}
}

class Olympic{

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue( new SortByGold());

		pq.offer(new OlympiGold ("India " , 1));
		pq.offer(new OlympicGold("China " , 38));
		pq.offer(new OlympicGold("USA " , 39));
		pq.offer(new OlympicGold("JAPAN" , 27));

		System.out.println(pq);
		System.out.println("===========================================================================");
		Iterator itr = pq.iterator();

		while(itr.hasNext()){

			System.out.println(itr.next());
		}

		System.out.println("========================================================================");
	}
}