package Question4;

public class CreditCard {
	
	String cardNo;
	int code;
	private static CreditCard uniqueinstance;//private instance
	
	
	private CreditCard() {//private constructor
	}
	
	public static CreditCard getInstance() { //public method
		if(uniqueinstance== null) {
			uniqueinstance = new CreditCard();
			}
			

		return uniqueinstance;
	}
	
	public Boolean validate(String cardno,int code) {
		int lengthOfInt = String.valueOf(code).length();
		if(cardno.length()==16 && lengthOfInt==3) {
			System.out.println("Valid Details");
			return true;
			
		}
		else
			System.out.println("Invalid Details");
			return false;
	}
}
