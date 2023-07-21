package Question2;

public class MultiplyNumbers implements Runnable {

	DemoThreads demoThread;
	int begin;
	int end;
	String name;
	
	public MultiplyNumbers(DemoThreads demoThread, int begin, int end,String name) {
		super();
		this.demoThread = demoThread;
		this.begin = begin;
		this.end = end;
		this.name=name;
	}
	
	public void multiplyNumbers(DemoThreads demoThread, int begin,int end,String name) {
		
		synchronized(demoThread) {
			
			for(int i = begin;i<end;i++) {
				try {
					Thread.sleep(1000);
					System.out.println(this.name +"=>" +i+ "*" +i+ "=" +(i*i));
					demoThread.notify();
					demoThread.wait();
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
	multiplyNumbers(demoThread, begin, end,name);
	}
	
	
	
	
	
}
