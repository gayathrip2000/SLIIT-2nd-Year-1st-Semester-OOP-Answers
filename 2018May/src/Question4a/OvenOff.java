package Question4a;

public class OvenOff implements Command {

	Oven oven;
	
	public OvenOff(Oven oven) {
		
		this.oven = oven;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		oven.off();
	}

}
