package Question2;

public class AddNumbers implements Runnable {
	
	DemoThreads demoThread;
	int begin;
	int end;
	String name;
	
	
	public AddNumbers(DemoThreads demoThread, int begin, int end,String name) {
		super();
		this.demoThread = demoThread;
		this.begin = begin;
		this.end = end;
		this.name=name;
	}
	
	public void addNumbers(Object lock, int begin, int end,String name) {
		synchronized(demoThread) {
			for(int i = begin;i<end;i++) {
				
				try {
					Thread.sleep(1000);
					System.out.println(this.name+ "=>" +i+ "+" +i+ "=" +(i+i)) ;
					demoThread.wait();
					demoThread.notify();
	
					
				} catch (InterruptedException e) {
					
					// TODO: handle exception
					e.printStackTrace();
				}
			
			}
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		addNumbers(demoThread, begin, end,name);
	}
}
