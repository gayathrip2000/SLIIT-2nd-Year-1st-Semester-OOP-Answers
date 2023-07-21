package Question2;

public class CalSum implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
			int sum = 0;
		
		for(int i = 1; i <= 100000; i++) {
			sum = sum + i;
		}
		
		System.out.println("Answer : " +sum);
		System.out.println(Thread.currentThread().getName());
	}
		
	
}
	

