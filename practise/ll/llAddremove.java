//@goal Add and remove elements from linked list using add,addFirst(),addLast()
 //  and remove(),removeLast(),removeFirst();

import java.util.*;

 class LLStr{

 	public static void main(String[] args) {
 		
 		LinkedList<String> l1 = new LinkedList<String>();
 		l1.add("A");
 		l1.add("B");
 		l1.addFirst("D");
l1.addLast("C"); 
//l1.addLast("T");
 		l1.add(3,"X");
 		l1.add("w");
 		l1.add("s");

 		System.out.println(l1);

 		l1.remove("B");
 		l1.remove(1);
 		l1.removeFirst();
 		l1.removeLast();
 		System.out.println(l1);



 	}
 }