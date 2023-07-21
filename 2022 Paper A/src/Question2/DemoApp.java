package Question2;

public class DemoApp {

	public static void main(String args[]) {
		
		
		TCalculation<Integer> interger = new TCalculation<>();
		interger.append(12);
		interger.append(1);
		interger.append(111);
		interger.append(1342);
		interger.append(1122);
		
		
		TCalculation<Double> doub = new TCalculation<>();
		doub.append(11.0);
		doub.append(12.0);
		doub.append(13.0);
		doub.append(14.0);
		doub.append(15.0);
		
		System.out.println(interger.average());
		System.out.println("\n" + doub.average());
	}
}
