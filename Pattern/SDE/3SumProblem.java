import java.util.*;

class Sum3Problem{

	public static List<List<Integer>> threeSum(int num[]){

		List<List<Integer>> res = new LinkedList<>();
		Arrays.sort(num);

		for (int i = 0 ; i < num.length-2 ; i++ ) {
				
			if(i == 0 || (i >0 && num[i] != num[i-1])){

				int low = i+1 , high = num.length-1, sum = Math.abs(num[i]); 

				while(low < high){

					int val = num[low] + num[high];
					//System.out.println(" value is " + val);
					if(val == sum){
						//System.out.println("true");
						res.add(Arrays.asList(num[i] , num[low] , num[high]));
						System.out.println(res);
					while(num[low] != num[low+1]) low++;
					while(num[high] != num[high-1]) high--;
					low++;high--;

				}else if(val > sum) 	
						high--;
						low++;
				
			}
			}
		}

		return res;
	}
	public static void main(String[] args) {
		
		List<List<Integer>> arr = new LinkedList<>();
		int num [] = {-1,-2,-2,-1,-1,2,0,2,0,0,2};
		arr = threeSum(num);

		for (int i =0 ; i < arr.size() ; i++ ) {
			
			System.out.println(arr.get(i));
		}
	}
}


