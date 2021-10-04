import java.util.LinkedList;

class Link{

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(1,90);
		list.add(2,70);
		list.add(190);
		list.add(220);
		list.add(true);
		list.add("Damodar");
		System.out.println("Linked list is " + list);
	}
}