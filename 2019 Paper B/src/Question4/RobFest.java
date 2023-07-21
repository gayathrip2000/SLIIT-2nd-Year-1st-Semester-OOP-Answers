package Question4;

public class RobFest implements IFestival {

	double budget;
	
	
	@Override
	public void performEvent() {
		// TODO Auto-generated method stub
		System.out.println("Peform RobFest Event for "+getBudget());
	}

	@Override
	public double getBudget() {
		// TODO Auto-generated method stub
		budget =800000.00;
		return budget;
	}

}
