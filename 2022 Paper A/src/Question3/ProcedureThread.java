package Question3;

import java.util.ArrayList;

public class ProcedureThread implements Runnable {

	private ArrayList<Integer>array;
	
	
	public ProcedureThread(ArrayList<Integer>array) {
		// TODO Auto-generated constructor stub
		super();
		this.array=array;
	}

	public void run() {
				int x =10;
				
				while(true) {
					synchronized(array) {
						try {
							System.out.println("Producer started");
							array.add(x);
							
							System.out.println("Producer sadding value = " +x+ "to queue");
							x += 10;
							Thread.sleep(1000);
							array.wait();
							array.notify();
						}catch(InterruptedException e) {
							
							e.printStackTrace();
						}
					}
				}
				
						
		}
		
	}
	
	

