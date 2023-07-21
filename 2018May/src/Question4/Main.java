package Question4;

public class Main {
	
	public static void main(String[] args) {
		
		CreditCard uniqueinstance =  CreditCard.getInstance();//create object
		CreditCard uniqueinstance1 =  CreditCard.getInstance();
		
		uniqueinstance.validate("1234567891234562", 123);
		uniqueinstance1.validate("123459123562", 123);
	}

}
