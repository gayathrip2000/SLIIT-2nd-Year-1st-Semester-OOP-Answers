package Question3;

public class MultiplyThread  implements Runnable{

	
	Object lock;
	int start;
	int range;
	
	public MultiplyThread(Object lock, int start, int range) {
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
	}


	public void multiplyNumbers(Object lock, int start, int range) {
		
		synchronized(lock){
			
			for(int i = start; i <= range; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Thread -1 =>" +i+ "*" +i+ "=" +(i*i));
					lock.wait();
					lock.notify();
				
				
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		 multiplyNumbers(lock, start, range);
	}

}
