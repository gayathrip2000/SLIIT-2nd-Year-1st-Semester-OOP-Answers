package Question1;

public abstract class Item {

	String dItem;
	double cost;
	double qun;
	
	public Item() {
		
	}
	
	public Item(String dItem, double cost, double qun) {
		super();
		this.dItem = dItem;
		this.cost = cost;
		this.qun = qun;
	}
	public abstract String dispalyItem(String dItem);
	public abstract double getCost(double cost);
	public abstract double getQuantity(double qun);
	
	
}
