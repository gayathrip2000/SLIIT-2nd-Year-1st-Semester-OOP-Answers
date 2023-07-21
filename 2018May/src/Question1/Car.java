package Question1;

public class Car extends Item {
	
	String model;
	String type;
	
	
	public Car(int itemNo, String description, double unitprice, String model, String type) {
		super(itemNo, description, unitprice);
		this.model = model;
		this.type = type;
	}
	
	public void Display() {
		super.Display();
		System.out.println("Model :" +this.model);
		System.out.println("Type :" +this.type);
	}
	

}
