package Question1;

public class DroneSatllite implements ISatellite {

	
	String dName;
	public DroneSatllite(String dName) {
		this.dName=dName;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		System.out.println(this.dName+ "drone satelite activate");
	}

	@Override
	public void deactivate() {
		// TODO Auto-generated method stub
		System.out.println(this.dName+ "drone satelite activate");
	}

}
