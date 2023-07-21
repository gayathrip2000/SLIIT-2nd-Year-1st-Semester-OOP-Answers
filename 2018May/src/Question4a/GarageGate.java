package Question4a;

public class GarageGate {

	
	String description;
	
	
	
	public GarageGate(String description) {
		super();
		this.description = description;
	}

	public void open() {
		System.out.println(description+ " Gate is open");
	}
	
	public void close() {
		System.out.println(description+ " Gate is closed");
	}

	
}

