
package Question1;

public abstract class Item {

	int itemNo;
	String description;
	double unitprice;
	
	public Item(int itemNo, String description, double unitprice) {
	
		this.itemNo = itemNo;
		this.description = description;
		this.unitprice = unitprice;
	}
	
	public void Display() {
		System.out.println("Item No : "+this.itemNo);
		System.out.println("Description :"+this.description);
		System.out.println("UnitPrice : "+this.unitprice);
	}
	
	
}
