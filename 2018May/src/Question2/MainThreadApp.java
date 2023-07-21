package Question2;

public class MainThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDown c = new CountDown();

		
		
		
		Thread t1 = new Thread(new CalSum());
		
		Thread t2 = new Thread(new CalSum());
		
		t1.setName("Black");
		t1.setName("White");
		
		c.start();
		
		try {
			c.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.start();
		
		t2.start();
		

	}

}
