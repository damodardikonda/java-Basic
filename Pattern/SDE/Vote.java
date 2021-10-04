import  java.util.*;

class Vote{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the len");
		int n = sc.nextInt();
		String ans[] = new String[n];
		String name[] = new String[n];
		for (int i = 0 ; i < n ; i++ ) {
			
			name[i] = sc.next();
		}

		for (int i = 0 ; i < n ; i++ ) {
			
			System.out.println(name[i]);
		}

		String name1 = null;
		int votes[] = new int[n];
		for(int i = 0 ; i < n ; i++){
			votes[i] = 0;
		}
 		for (int i = 0 ; i < n ; i++){

			name1 = name[i];

			for(int j = 0 , k = 0; j < n-1 ; j++){

				if(name1 == name[j] ){
							votes[i]++;
					
						name[j] = name[j+1];
						
				}
				ans[k] = name1;
				k++;
			}
		}
			
		for (int i = 0 ; i < n ; i++ ) {
			
			System.out.println(name[i]);
		}


		
		int max_vote = votes[0];
		int min_vote = votes[0];
		int k = 0 , min= 0 , max =0;

		while(k < votes.length){
			if(votes[k] > max_vote){
				max_vote = votes[k];
				max = k;
			}else {

				min = k;
			}
			k++;

		}

		System.out.println(ans[max] +" " +votes[max]);
		System.out.println(ans[min] + " " + votes[min]);
	}
}