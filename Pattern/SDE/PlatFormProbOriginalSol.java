import java.util.*;

class PlatFormProb{

	public int total_platForm(int start[] , int dep[] , int n ){

		int dep_need = 0 , max = 1;

		Arrays.sort(start);
		Arrays.sort(dep);

		int i = 0 , j = 0 ;  

		while(i < n && j < n){

			if(start[i] <= dep[j]){
				dep_need++;
				i++;
			}else if(start[i] > dep[j]){

				dep_need--;
				j++;
			}if(dep_need > max)
				max =dep_need;
		}

			return max;
	}
	public static void main(String[] args) {
		
		int start[] = {50 , 120 ,200 , 550 , 700 , 850};
		int dep[] = {500 , 550 , 700 , 600 , 900 , 1000};
		int n = 6;

		PlatFormProb pf = new PlatFormProb();
		int max = pf.total_platForm(start , dep , n);
	
		System.out.println( max + "  platform required");

	}
}