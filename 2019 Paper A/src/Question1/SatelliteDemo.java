package Question1;

public class SatelliteDemo {

	public static void main(String[] args) {
		
		ISatellite navigationsatellite = new NavigationSatellite("Ravana-01");
		IGeoLocation Ilocation = new  SatelliteLocation("Srilanka");
		ISatellite dronsatellite = new  DroneSatllite("Ravana-02");
		IGeoLocation dlocation = new SatelliteLocation("Russia");
		
		ISatellite [] satelliteArray = new ISatellite [] {navigationsatellite,dronsatellite}; 
		IGeoLocation[]trackerArray=new IGeoLocation[] {Ilocation,dlocation};
		
		SateliteCenter satelliteCenter=new SateliteCenter (0,satelliteArray,trackerArray);
		
		satelliteCenter.startService();
		satelliteCenter.stopService();
		satelliteCenter.locationService();
		
		System.out.println("");
		SateliteCenter remoteController2=new SateliteCenter(1,satelliteArray,trackerArray);
		
        remoteController2.startService();
        remoteController2.stopService();
        remoteController2.locationService();

	}

}
