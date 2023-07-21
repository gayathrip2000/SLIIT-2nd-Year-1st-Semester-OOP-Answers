package Question1;

public class NavigationSatellite implements ISatellite{

	String stname;
	public NavigationSatellite(	String stname) {
		// TODO Auto-generated constructor stub
		this.stname=stname;
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		System.out.println(this.stname+ "navigational satelite activate");
	}

	@Override
	public void deactivate() {
		// TODO Auto-generated method stub
		System.out.println(this.stname+ "navigational satelite activate");
	}

	
	
}
