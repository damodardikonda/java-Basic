 class Anagram{

 	static void areAnagram(char arr1[] , char arr2[]){
 		boolean flag = true;
 		int len1 = arr1.length;
 		int len2 = arr2.length;
 		int maxlen = 0;
 		if(len1 != len2)
 			System.out.println(" Not Anagram");

 		if(len1 == len2){

 			for (int i = 0 ; i < arr.length-1 ; i++ ) {
 				
 				if((int) arr1[i+1] > (int) arr1[i] ){
 					int temp = arr1[i];
 					arr1[i] = arr1[i+1]
 					arr1[i+1] = arr1[i];
 				}

 			}

			for (int j = 0 ; j < arr.length-1 ; j++ ) {
 				
 				if((int) arr1[j+1] > (int) arr1[j] ){
 					int temp = arr1[j];
 					arr1[j] = arr1[j+1]
 					arr1[j+1] = arr1[j];
 				}

 			}

 			if(len1 > len2)

 					maxlen = len1;
 			else 
 				maxlen = len2;
 			

 			for (int i = 0 ; i < maxlen ; i++ ) {
 				
 				if(arr1[i] != arr2[i]){

 					flag = false;
 					break;
 				}else
 					flag = true;
 			}

 			if( flag == true)
 				System.out.println("Anagram");
 			else
 				System.out.println(" Not Anagram");
 		}
 	}

 	public static void main(String[] args) {
		
 		String  s1 = "Silence";
 		String s2 = "listen";

 		s1 = s1.toLowerCase();
 		s2 = s2.toLowerCase();

 		char arr1[] = s1.toCharArray();
 		char arr2[] = s2.toCharArray();

 		areAnagram(arr1 , arr2); 
 	}
 }