package Question4;

public class GameFest implements  IFestival{

	double budget;
	@Override
	public void performEvent() {
		// TODO Auto-generated method stub
		System.out.println("Peform GameFest Event for "+getBudget());
	}

	@Override
	public double getBudget() {
		// TODO Auto-generated method stub
		budget=400000.00;
		return budget;
	}

}
