package Question1;

public class RemoteController {

	int Switch;
	ISensor[] ab;
	IMotionTracker[] ab2;
	
	
	public RemoteController(int switch1, ISensor[] ab, IMotionTracker[] ab2) {
		
		Switch = switch1;
		this.ab = ab;
		this.ab2 = ab2;
	}
	
	public void startService() {
		
		switch(Switch) {
		
		case 0:
			ab[0].on();
			break;
		case  1:
			ab[1].on();
			break;
		default:
			System.out.println("Error");
		
		}
	}
	
	public void stopService() {
		
		switch(Switch) {
		
		case 0:
			ab[0].on();
			break;
		case  1:
			ab[1].on();
			break;
		default:
			System.out.println("Error");
		
		}
		
				
	}
	public void locationService() {
		switch(Switch) {
		
		case 0:
			ab2[0].displayLocation();
			break;
		case  1:
			ab2[1].displayLocation();
			break;
		default:
			System.out.println("Error");
		
		}
		}
		
	}
	

