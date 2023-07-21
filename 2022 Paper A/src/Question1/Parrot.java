package Question1;

public class Parrot extends Pet {
	
	private int totalPoints;
	private String command;
	
	public Parrot(String command) {
		super();
		this.command = command;
	}

	public boolean isCaught(String command) throws CaughtException {
		try {
			if(command == "Walk") {
				throw new CaughtException("Caught");
			}
		}catch(CaughtException c) {
			System.out.println(c);
			return true;
		}
		
		System.out.println("Did not caught");
		return false;
	}
	
	public void feed() {
		totalPoints = totalPoints + 5;
		System.out.println("Feeding the Parrot");
	}
	public void clean() {
		totalPoints = totalPoints + 10;
		System.out.println("Cleaning the Parrot");
	}
	public void cuddle() {
		totalPoints = totalPoints + 15;
		System.out.println("Cluddling the Parrot");
	}
	
	public void  GetTotalPoints() throws CaughtException {
		boolean caught;
		caught = isCaught(command);
		
		if(caught == true) {
			this.totalPoints = 0;
		}
		else {
			System.out.println("Total point is " + totalPoints);
		}
	}
	

}
