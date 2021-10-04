import java.util.*;

class Meeting{

	int start = 0;
	int end  = 0;
	int pos = 0;

	Meeting(int start , int end , int pos){

		this.start =start;
		this.end = end;
		this.pos = pos;
	}
}

class MeetingComparator implements Comparator{

	public int compare(Meeting m1 , Meeting m2){

		if(m1.end < m2.end)
			return -1;
		else if(m1.end > m2.end)
			return 1;
		else if(m1.pos < m1.pos)
			return -1;
		else 
			return 1;
	}
}

class Main{

	public void nMeet(int start[] , int end[]){

		ArrayList al = new ArrayList();

		for (int i = 0 ; i < start.length ; i++) {
			
			al.add(new Meeting(start[i] , end[i] , i+1));
		}

		Collections.sort(al , new MeetingComparator());

		ArrayList answer =new ArrayList();
		answer.add(al.get(0).pos);
		int limit = al.get(0).end;

		for (int i = 1 ; i < start.length ; i++ ) {
			
			if(al.get(i).start > limit){

				limit= al.get(i).end;
				answer.add(al.get(i).pos);
			}
		}


		for (int i = 0 ; i < answer.size() ; i++ ) {
			
			System.out.println(answer.get(i));
		}

	}
	public static void main(String[] args) {
		
		int start[] = {1,3,0,5,8,5};
		int end[] = {2,4,6,7,9,9};

		Main m =new Main();
		m.nMeet(start , end);
	}
}