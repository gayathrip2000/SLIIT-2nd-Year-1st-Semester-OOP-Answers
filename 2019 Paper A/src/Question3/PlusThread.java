package Question3;

public class PlusThread implements Runnable {

	Object lock;
	int start;
	int range;
	
	
	public PlusThread(Object lock, int start, int range) {
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
	}

	
	public void addNumbers(Object lock, int start, int range) {
	
		synchronized(lock) {
		for(int i = start;i<=range;i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("Thread -0 =>" +i+ "+"  +i+ "=" +(i+i));
				lock.notify();
				lock.wait();
				
			}catch(InterruptedException e) {
				
				e.printStackTrace();
				
			}
		}
		}
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		 addNumbers(lock,start,range);
	}
	

}
