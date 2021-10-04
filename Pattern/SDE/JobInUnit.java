import java.util.*;

class JobUnit{

	int id = 0;
	int deadline = 0 ;
	int project = 0;

	JobUnit(int id , int deadline , int project){

		this.id = id;
		this.deadline = deadline;
		this.project =  project;
	}
}
/*
class JobComparator implements Comparator<JobUnit>{

	public int compare(JobUnit j1 , JobUnit j2){

		if(j1.project < j2.project)
			return -1;
		else if(j1.project > j2.project)
			return 1;
		else if(j1.deadline <= j2.deadline)
			return -1;
		else return 1;
	}


}*/
class JobInUnit{

	public void maxProfit(int id[] , int deadline[] , int project[] , int n){

		ArrayList<JobUnit> al =  new ArrayList<>();

		for (int i = 0 ; i < id.length ; i++ ) {
			
			al.add(new JobUnit(id[i] , deadline[i] , project[i]));
		}

		Collections.sort(al , (a , b) ->b.project- a.project );
		
		int len = 0;
		for (int i = 0 ; i < al.size() ; i++ ) {
			
			if(al.get(i).deadline > len)
				len =al.get(i).deadline;
		}

		int dead[] = new int[len+1];
		for (int i = 0 ; i < dead.length ; i++) {
			dead[i] = -1;
		}
		int max_profit = 0 , count_job = 0;
		for (int i = 0 ; i < n ; i++) {
			
			for (int j = al.get(i).deadline ; j > 0; j-- ) {
				
				if(dead[j] == -1){

					dead[j] = al.get(i).deadline;
					count_job++;
					max_profit =  max_profit + al.get(i).project;
				}
			}
		}

		System.out.println(" total job are = " + count_job);
		System.out.println(" maximum profit is "+ max_profit);
	}

	public static void main(String[] args) {
		
		JobInUnit jb = new JobInUnit();
		int id[] = {1,2,3,4,5,6,7,8};
		int deadline[] = {4,5,6,6,4,2,2,2};
		int project[] = {20,60,70,65,25,80,10,22};
		jb.maxProfit(id , deadline , project , 8);
	}
}