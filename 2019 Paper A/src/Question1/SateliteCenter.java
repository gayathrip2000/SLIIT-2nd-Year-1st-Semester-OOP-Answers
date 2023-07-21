package Question1;

public class SateliteCenter {

	
	int option;
	ISatellite[] arr;
	IGeoLocation[] arr2;
	
	
	public SateliteCenter(int option, ISatellite[] arr, IGeoLocation[] arr2) {
		
		this.option = option;
		this.arr = arr;
		this.arr2 =arr2;
	}
	
	public void startService() {
		
		switch(option){
			
		case 0:
			arr[0].activate();
			break;
		case 1:
			arr[1].activate();
			break;
		 default:
			 System.out.println("Error");
		}
		
	}
	
	public void stopService() {

		switch(option){
			
		case 0:
			arr[0].deactivate();
			break;
		case 1:
			arr[1].deactivate();
			break;
		default:
			 System.out.println("Error");
		}
		
		
	}
	
	public void locationService() {

		switch(option){
			
		case 0:
			arr2[0].displayLocation();
			break;
		case 1:
			arr2[1].displayLocation();
		break;
		default:
			 System.out.println("Error");	
		}
		
	}
}
