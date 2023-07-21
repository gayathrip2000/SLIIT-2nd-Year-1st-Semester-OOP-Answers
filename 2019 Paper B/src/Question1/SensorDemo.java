package Question1;

public class SensorDemo {
	
	public static void main(String[] args)
	{
		ISensor himiditysensor = new HumiditySensor( "Humidity");
		IMotionTracker mlocation = new SensorLocation("Colombo") ;
		ISensor rainsensor = new RainFallSensor( "RainFall");
		IMotionTracker rlocation = new SensorLocation("Kandy") ;
		
		ISensor[] sensorArray = new ISensor[] {himiditysensor,rainsensor};

		IMotionTracker[] locationrray = new IMotionTracker[] {mlocation,rlocation};
		
		RemoteController remoteController = new RemoteController(0, sensorArray, locationrray);
		remoteController.startService();
		remoteController.stopService();
		remoteController.locationService();
		
		System.out.println("");
		
		RemoteController remoteController2 = new RemoteController(1, sensorArray, locationrray);
		remoteController2.startService();
		remoteController2.stopService();
		remoteController2.locationService();
		
		
		
		
		
		
		
		
	}

}
