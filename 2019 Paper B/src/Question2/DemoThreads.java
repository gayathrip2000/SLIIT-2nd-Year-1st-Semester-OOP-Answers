package Question2;

public class DemoThreads {

	public static void main(String[] args) {
		
		DemoThreads demoThread = new DemoThreads();
		Thread addNumbers= new Thread(new AddNumbers(demoThread,10,20,"ADD"));
		Thread multiplytNumbers = new Thread(new MultiplyNumbers(demoThread,10,20,"MUL"));
		
		
		addNumbers.start();
		multiplytNumbers.start();
	}
	
}
