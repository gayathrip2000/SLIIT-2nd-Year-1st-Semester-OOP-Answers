package Question4II;

public class MainApp {
	
	public static void main(String[] args) {
	
	CreditCard cd= CreditCard.getInstance();
	CreditCard cd1 = CreditCard.getInstance();
	
	
	cd.validate("1233", 1);
	cd.validate("1234567891234567", 123);
	
	}

}
