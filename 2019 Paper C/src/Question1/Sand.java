package Question1;

public class Sand extends Item{


	int qtyCubes;
	
	public Sand(int qtyCubes) {
		// TODO Auto-generated constructor stub
		this.qtyCubes=qtyCubes;
	}
	

	public Sand(String dItem, double cost, double qun) {
		super(dItem, cost, qun);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String dispalyItem(String dItem) {
		// TODO Auto-generated method stub
		return this.dItem;
	}


	@Override
	public double getCost(double cost) {
		// TODO Auto-generated method stub
		return this.cost;
	}


	@Override
	public double getQuantity(double qun) {
		// TODO Auto-generated method stub
		return this.qun;
	}



	
	
}
