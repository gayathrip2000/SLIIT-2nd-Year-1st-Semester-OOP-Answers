package Question4;

public class CodeFest implements IFestival {

	double budget;
	@Override
	public void performEvent() {
		// TODO Auto-generated method stub
		System.out.println("Peform CodeFest Event for  " +getBudget());
	}

	@Override
	public double getBudget() {
		// TODO Auto-generated method stub
		budget = 300000.00;
		return budget;
	}

}
