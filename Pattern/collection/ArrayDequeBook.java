import java.util.*;


class Book{

	int id = 0 , price = 0;
	String author = null , publication = null;

	Book(int id , int price , String author , String publication){

		this.id =id;
		this.price =  price;
		this.author = author;
		this.publication = publication;
	}

	public static void main(String[] args) {
		
		Book b1 = new Book(1,1000,"Damodar","Apla");
		Book b2 = new Book(2,2000,"Niket","Apla");
		Book b3 = new Book(3,3000,"tanmay","Aplaaaaaaaaaaaa");

		Deque <Book> d =  new ArrayDeque<Book>();

		d.add(b1);
		d.add(b2);
		d.add(b3);
		for(Book str : d){

			System.out.println(str.id + " " + str.price + " " + str.author + " " + str.publication);
		}

	}

}


