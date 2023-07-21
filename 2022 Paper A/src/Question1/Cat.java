package Question1;

public class Cat extends Pet{
	
private int totalPoints;
	
	public void feed() {
		totalPoints = totalPoints + 5;
		System.out.println("Feeding the Cat");
	}
	public void clean() {
		totalPoints = totalPoints + 10;
		System.out.println("Cleaning the Cat");
	}
	public void cuddle() {
		totalPoints = totalPoints + 15;
		System.out.println("Cluddling the Cat");
	}
	
	public void  GetTotalPoints() {
		System.out.println("Total point is " + this.totalPoints);
	}
	

	

	
	
}
