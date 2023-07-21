package Question1;

public class Book extends Item {

	String publisher;
	String category;
	int pages;
	
	public Book(int itemNo, String description, double unitprice, String publisher, String category, int pages) {
		super(itemNo, description, unitprice);
		this.publisher = publisher;
		this.category = category;
		this.pages = pages;
	}
	
	public void Display() {
		super.Display();
		System.out.println("Publisher : "+this.publisher);
		System.out.println("Category : "+this.category);
		System.out.println("Pages : "+this.pages);
		
	}
	
}
