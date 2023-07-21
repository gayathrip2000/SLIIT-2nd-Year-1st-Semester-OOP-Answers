package Question4;

public class ToyotaCar implements Car{

	CarAirBag carAirbag;
	
	public ToyotaCar(CarAirBag c) {
		this.carAirbag=c;
	}
	
	@Override
	public void assembleLight() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for Toyota");
		carAirbag.airBagLightIndecator();
	
		
	}

	@Override
	public void assembleMotionSensor() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for Toyota");
		carAirbag.airBagMotionDetection();
	}

}
