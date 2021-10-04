import java.util.*;

class PlatForm{

	int start = 0;
	int end = 0 ;
	int pos = 0;

	PlatForm(int s , int e , int p){

		s = start;
		end = e;
		pos = p;
	}
}

class trainComparator implements Comparator{

	public int compare(PlatForm p1 , PlatForm p2){


		if(p1.end < p2.end)
			return -1;
		else if(p1.end > p2.end)
			return 1;
		else if(p1.pos < p2.pos)
			return -1;
		else
			return 1;
	}

}
class Main{

	public int train(int start[] , int end[]){

		ArrayList al = new ArrayList();
		for (int i = 0 ; i < start.length ; i++ ) {
			
			al.add(new PlatForm(start[i] , end[i] , i+1));
		}
		
		for(int i = 0 ; i < al.size();i++)
			System.out.println(al.get(i));

		Collections.sort(al , new trainComparator());

		for(int i = 0 ; i < al.size();i++)
			System.out.println(al.get(i));

		int count = 1 ;
		int limit = al.get(0).end;

		for (int i = 1 ; i < start.length ;i++ ) {
			
			if(al.get(i).start < limit)
				count++;
			limit = al.get(i).end;
		}

		return count;

	}

	public static void main(String[] args) {
		int start[] = {900 ,940 ,950 ,1100 , 1500 , 1800};
		int end[] = {910,1200,1120,1130,1900,2000};
		Main m = new Main();
		int total = m.train(start,end);
		System.out.println("otal required trains are " + total);
	}
}