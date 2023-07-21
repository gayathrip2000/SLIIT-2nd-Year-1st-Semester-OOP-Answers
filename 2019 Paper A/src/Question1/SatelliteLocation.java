package Question1;

public class SatelliteLocation implements IGeoLocation {
					
	String location;
	public SatelliteLocation(String location) {
			// TODO Auto-generated constructor stub
		this.location=location;
	}

	@Override
	public void displayLocation() {
		// TODO Auto-generated method stub
		System.out.println("Sattelite Location is =" +this.location);
	}

}
