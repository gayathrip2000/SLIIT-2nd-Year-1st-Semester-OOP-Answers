package Question4;

public class BScPrograms implements IPrograms{

	double cost;
	@Override
	public void offerPrograms() {
		// TODO Auto-generated method stub
		System.out.println("Offer BSc degree programs");
	}

	@Override
	public double getCost() {
		cost=120000.00;
		return cost;
	}

}
