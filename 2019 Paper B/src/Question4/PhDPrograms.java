package Question4;

public class PhDPrograms implements IPrograms {

	double cost;
	
	@Override
	
	public void offerPrograms() {
		// TODO Auto-generated method stub
		System.out.println("Offer PHd degree programs");
	}

	@Override
	public double getCost() {
		cost=6000000;
		// TODO Auto-generated method stub
		return cost;
	}

}
