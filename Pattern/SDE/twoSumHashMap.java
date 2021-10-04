/*
	givan an array of integer num[2,7,1,11,87] you have to find out the number from that which addition
	 gives an target value 

	e.g = nums=[2,7,1,11,87] target = 9 
	op == 1,2 (1 ,2 is an index)
*/
import java.util.*;
class TwoSumHashMap{

	public static void main(String[] args) {
		
		int num[]={1,11,87,2,7};
		int target = 9;
		int temp1 = 0, temp2 = 2;

		Map<Integer,Integer> mp = new HashMap<>();

		for (int i= 0; i < num.length ; i++ ) {
			
			if(mp.containsKey(target-num[i])){

				temp1 = i;
				temp2 = mp.get(target-num[i]);
				break;
			}

			mp.put(num[i] , i );
		}

		System.out.println(" position is = " + temp1 + " " + temp2 );
	}
}