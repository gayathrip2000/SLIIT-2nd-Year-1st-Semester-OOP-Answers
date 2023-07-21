package Question4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarAirBag fAirbag =new FrontAirBag();
		CarAirBag sAirbag = new SideAirBag();
		
		
		new NissanCar(fAirbag).assembleLight();
		new NissanCar(fAirbag).assembleMotionSensor();
		new NissanCar(sAirbag).assembleMotionSensor();
		
		
		
		new ToyotaCar(fAirbag).assembleLight();
		new ToyotaCar(fAirbag).assembleMotionSensor();
		new ToyotaCar(sAirbag).assembleLight();
		new ToyotaCar(sAirbag).assembleMotionSensor();

	}

}
