/*

	Given an array of unsorted integer and find out te length of longest consecutive inteeger

	e.g == [101,1,100,102,2,3,4]

			100,101,102 he consecutive ahet tyanchi len he 3 ahe 
			1,2,3,4he sudda longest consecutive ahe tyanchi len 4 ae

			so output is 4
*/

import java.util.*;
class LongestSeq{

	public static void main(String[] args) {
		
		int nums[] = {101,1,100,102,2,3,4};
		int largest = 0;
		Set<Integer> set = new HashSet<Integer>();
		int current = 0 , count = 0;
		for(int num : nums)
			set.add(num);

		for ( int num : nums ) {
			
			if(!set.contains(num-1)){

				current = num;
				count = 1;

				while(set.contains(current+1)){
					current+=1;
					count++;
				}

				largest = Math.max(largest,count);

			}

		}
		
		
		System.out.println(" largest element is " + largest);
		
		

	}
}