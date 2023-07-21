package Question4a;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobileUI mu = new MobileUI();
		
		Oven mainOven = new Oven("Philips");
		GarageGate grageGate = new GarageGate("Steel");
		
		OvenOn m = new OvenOn(mainOven);
		OvenOff m1 = new OvenOff(mainOven);
		GrageOpen m3 = new GrageOpen(grageGate);
		GrageClose m4 = new GrageClose(grageGate);
		
		
		mu.setCommand(0,m);
		mu.setCommand(1, m1);
		mu.setCommand(2, m3);
		mu.setCommand(3, m4);
		
		
		mu.commmandPressed(0);
		mu.commmandPressed(1);
		mu.commmandPressed(2);
		mu.commmandPressed(3);
		
		
		
	}

}
