package Question1;

public class SensorLocation implements IMotionTracker {

	String Slocation;
	
	
	
	public SensorLocation(String slocation) {
		
		Slocation = slocation;
	}



	@Override
	public void displayLocation() {
		// TODO Auto-generated method stub
		System.out.println("Sensor Location is " +this.Slocation);
	}

}
