import java.util.*;

class DLList{

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();

		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);

System.out.println(l1);
        l1 = Rever(l1);

System.out.println(l1);
	}

	public static LinkedList<Integer> Rever(LinkedList<Integer> l1){

		for (int i = 0 ; i < l1.size() ; i++ ) {
			Integer temp = l1.get(i);
			l1.set(i,l1.get(l1.size()-i-1));
			l1.set(l1.size()-i-1 ,temp);
			/*llist.set(i, llist.get(llist.size() - i - 1));
            llist.set(llist.size() - i - 1, temp);*/ 	
		}

		return l1;
	} 
}