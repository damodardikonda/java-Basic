/*

	nums = [4,3,3,4,4,2,1,2,1,1]

	target = 9;

	n1+n2+n3+n4 == 9 asel
	tr ashya 4 quad che number print krr


		Array sort kara 

		i   j	left 							right
		1	1	1		2	2	3	3	4	4	4		i+j+left+right = target asel tr arraylist made tak nahi te nai

				sum < target == left++ else right++ krr

					      left 				right
		1	1	1	2	2	3	3	4	4	4  ----- repeated quad nai paije so left 2 ne pudh ghetla


		4	3	3	4	4		2	1	2	1	1
*/
import java.util.*;
	
class FourSumProblem{

		public void findSumQuad(int num[] , int target){

			ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();

			if(num == null || num.length == 0)
				System.out.println(" Array is empty");

			Arrays.sort(num);
			int target2 = 0 , left = 0 , right =0;
			int n = num.length;

			for (int i= 0 ; i < n ; i++ ) {
				
				for (int j = 0 ; j < n ; j++ ) {
					
					target2 = target - num[i] - num[j];

					 left = j+1;
					right = n-1; 

					while(left <  right){

						int two_sum = num[left] + num[right];

						if(two_sum < target2)
							left++;
						else if(two_sum>target2) 
							right--;
						else{

							ArrayList<Integer> quad = new ArrayList<Integer>();
							quad.add(num[i]);
							quad.add(num[j]);
							quad.add(num[left]);
							quad.add(num[right]);

							res.add(quad);

							while(left < right &&num[left] == quad.get(2))++left;
							while(left < right && num[right]== quad.get(3))--right;

						}

					}

					while(j+1<n && num[j+1] == num[j])j++;

				}

				while(i+1 < n && num[i+1] == num[i])i++;
			}

			System.out.println(" Quad is = ");

			for (int i  = 0 ; i < res.size() ; i++) {
				
				for (int j =0 ; j < res.get(i).size(); j++) {
					
					System.out.print(res.get(i).get(j) + " ");
				}

				System.out.println();
			}
		}

	public static void main(String[] args) {
		
		int arr[] = {4,3,3,4,4,2,1,2,1,1};
		int target = 9;
		FourSumProblem fsp = new FourSumProblem();
		fsp.findSumQuad(arr,target);
		}
	}
