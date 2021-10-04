/*

   Find out the majority of perticular elements. if count of an element is > length/2
   then print out that element .

   e.g. [1,2,1] ==> here length/2 == 1 and count of 1 == 2
   i.e count(2) > length/2 ===> so print true;

   use moores voting algorithm

   ********** It is work if one of the  element from array has more that length/2 occurance.
*/


class MajorityEle{

	public static void main(String[] args) {
		
		int arr[] = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};

		int count = 0 , element = arr[0];

		for (int i = 0 ; i < arr.length ; i++ ) {
			
			if(count == 0)
				element = arr[i];
			if(arr[i] == element)
				count++;
			else
				count--;
		}

		System.out.println(" majority element is " + element);
	}
}