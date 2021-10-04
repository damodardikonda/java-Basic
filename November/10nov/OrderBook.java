class PlayBook{

	static class Book{

			 int a = 10;
		 void orderBook(){
			System.out.println("Sanyasi jyane apli sampatti vikli");
			System.out.println( this.a);
		}
	}

	public static void main(String[] args) {
		new Book().orderBook();

		}
}
/*
class OrderBook{

	public static void main(String[] args) {
		
		PlayBook.Book b = new PlayBook.Book();
		b.orderBook();

		PlayBook.Book b1 = new PlayBook.Book();
		b1.orderBook();

	}
} 

*/