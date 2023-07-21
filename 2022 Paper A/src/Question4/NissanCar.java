package Question4;

public class NissanCar implements Car {

	CarAirBag carAirbag;
	
	public NissanCar(CarAirBag c) {
		this.carAirbag=c;
	}

	@Override
	public void assembleLight() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for Nissan");
		carAirbag.airBagLightIndecator();
		
	}

	@Override
	public void assembleMotionSensor() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for Nissan");
		carAirbag.airBagMotionDetection();
	}

}
