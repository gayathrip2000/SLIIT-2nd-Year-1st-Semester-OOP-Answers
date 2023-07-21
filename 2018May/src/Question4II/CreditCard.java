package Question4II;

public class CreditCard {
	

	String cardNo;
	int code;
	private static CreditCard cd;
	
	private CreditCard() {
		
	}

	public static CreditCard getInstance() {
		if(cd==null) {
			cd=new CreditCard();
			
		}
		return cd;
		
	}
	
	public Boolean validate(String cardno,int code) {
		int length = String.valueOf(code).length();
		if(cardno.length()==16 && length == 3) {
			System.out.println("Valid Details");
			return true;
		}
		else {
			System.out.println("Invalid details");
			return false;
		}
	}
}
